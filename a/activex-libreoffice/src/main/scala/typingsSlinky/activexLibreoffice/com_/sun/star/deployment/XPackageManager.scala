package typingsSlinky.activexLibreoffice.com_.sun.star.deployment

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XAbortChannel
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XPackageManager} interface is used to add or remove packages to a specific repository. This interface represents a particular repository.
  * Packages are deployable files, e.g. scripts or UNO components.
  *
  * Adding an UNO package means that a copy of the package is stored in the repository.
  *
  * Removing an UNO package means that the previously added package is removed from the repository.
  *
  * All interface methods do neither register nor revoke an extension. This happens exclusively by {@link XExtensionManager} .
  *
  * Objects of this interface are created using the {@link XPackageManagerFactory} service resp. the singleton `
  * /singletons/com.sun.star.deployment.thePackageManagerFactory` .
  * @deprecated DeprecatedUse XExtensionManager.
  * @see thePackageManagerFactory
  * @since OOo 2.0
  */
@js.native
trait XPackageManager
  extends XComponent
     with XModifyBroadcaster {
  
  /**
    * returns the underlying deployment context, that is, the name of the repository.
    * @returns underlying deployment context
    */
  val Context: String = js.native
  
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  val SupportedPackageTypes: SafeArray[XPackageTypeInfo] = js.native
  
  /**
    * adds an UNO package.
    *
    * The properties argument is currently only used to suppress the license information for shared extensions.
    * @param url package URL, must be UCB conform
    * @param properties additional properties, for example, that the license is to be suppressed (if supported by the extension)
    * @param mediaType media-type of package, empty string if to be detected
    * @param xAbortChannel abort channel to asynchronously abort the adding process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} handle
    */
  def addPackage(
    url: String,
    properties: SeqEquiv[NamedValue],
    mediaType: String,
    xAbortChannel: XAbortChannel,
    xCmdEnv: XCommandEnvironment
  ): XPackage = js.native
  
  /**
    * checks if the extension can be used.
    *
    * The extension must be managed by this package manager, that is, it must be recorded in its database. The package manager calls {@link
    * XPackage.checkPrerequisites} and updates its data base with the result. The result, which is from {@link Prerequisites} will be returned.
    */
  def checkPrerequisites(extension: XPackage, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Double = js.native
  
  /**
    * creates a command channel to be used to asynchronously abort a command.
    * @returns abort channel
    */
  def createAbortChannel(): XAbortChannel = js.native
  
  /**
    * returns the underlying deployment context, that is, the name of the repository.
    * @returns underlying deployment context
    */
  def getContext(): String = js.native
  
  /**
    * gets a deployed package.
    * @param identifier package identifier
    * @param fileName package file name
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} handle
    */
  def getDeployedPackage(identifier: String, fileName: String, xCmdEnv: XCommandEnvironment): XPackage = js.native
  
  /**
    * gets all currently deployed packages.
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns all currently deployed packages
    */
  def getDeployedPackages(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): SafeArray[XPackage] = js.native
  
  /**
    * returns all extensions which are currently not in use because the user did not accept the license.
    *
    * The function will not return any object for the user repository, because a user extension will not be kept in the user repository if its license is
    * declined. Only extensions which are registered at start-up of OOo, that is, shared and bundled extensions, can be returned.
    *
    * Extensions which allow the license to be suppressed, that is, it does not need to be displayed, and which are installed with the corresponding option,
    * are also not returned.
    */
  def getExtensionsWithUnacceptedLicenses(xCmdEnv: XCommandEnvironment): SafeArray[XPackage] = js.native
  
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  def getSupportedPackageTypes(): SafeArray[XPackageTypeInfo] = js.native
  
  /**
    * adds an extension.
    *
    * This copies the extension. If it was from the same repository, which is represented by this {@link XPackageManager} interface, then nothing happens.
    * @param extension
    * @param xAbortChannel abort channel to asynchronously abort the adding process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} handle
    */
  def importExtension(extension: XPackage, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): XPackage = js.native
  
  /**
    * indicates that this implementation cannot be used for tasks which require write access to the location where the extensions are installed.
    *
    * Normally one would call a method and handle the exception if writing failed. However, a GUI interface may need to know beforehand if writing is
    * allowed. For example, the Extension Manager dialog needs to enable / disable the Add button depending if the user has write permission. Only the
    * {@link XPackageManager} implementation knows the location of the installed extensions. Therefore it is not possible to check "externally" for write
    * permission.
    */
  def isReadOnly(): Boolean = js.native
  
  /**
    * Expert feature: erases the underlying registry cache and reinstalls all previously added packages. Please keep in mind that all registration status
    * get lost.
    *
    * Please use this in case of suspected cache inconsistencies only.
    * @param force set to true when called during soffice bootstrap after cleaning old extension cache
    * @param xAbortChannel abort channel to asynchronously abort the adding process
    * @param xCmdEnv command environment for error and progress handling
    */
  def reinstallDeployedPackages(force: Boolean, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit = js.native
  
  /**
    * removes an UNO package.
    * @param identifier package identifier
    * @param fileName package file name
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def removePackage(identifier: String, fileName: String, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit = js.native
  
  /**
    * synchronizes the extension database with the contents of the extensions folder.
    *
    * Added extensions will be added to the database and removed extensions will be removed from the database.
    * @param xAbortChannel abort channel to asynchronously abort the adding process
    * @param xCmdEnv command environment for error and progress handling
    * @returns If true - then at least one extension was removed or added. Otherwise nothing was changed.
    */
  def synchronize(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Boolean = js.native
}
object XPackageManager {
  
  @scala.inline
  def apply(
    Context: String,
    SupportedPackageTypes: SafeArray[XPackageTypeInfo],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addModifyListener: XModifyListener => Unit,
    addPackage: (String, SeqEquiv[NamedValue], String, XAbortChannel, XCommandEnvironment) => XPackage,
    checkPrerequisites: (XPackage, XAbortChannel, XCommandEnvironment) => Double,
    createAbortChannel: () => XAbortChannel,
    dispose: () => Unit,
    getContext: () => String,
    getDeployedPackage: (String, String, XCommandEnvironment) => XPackage,
    getDeployedPackages: (XAbortChannel, XCommandEnvironment) => SafeArray[XPackage],
    getExtensionsWithUnacceptedLicenses: XCommandEnvironment => SafeArray[XPackage],
    getSupportedPackageTypes: () => SafeArray[XPackageTypeInfo],
    importExtension: (XPackage, XAbortChannel, XCommandEnvironment) => XPackage,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    reinstallDeployedPackages: (Boolean, XAbortChannel, XCommandEnvironment) => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removePackage: (String, String, XAbortChannel, XCommandEnvironment) => Unit,
    synchronize: (XAbortChannel, XCommandEnvironment) => Boolean
  ): XPackageManager = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], SupportedPackageTypes = SupportedPackageTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPackage = js.Any.fromFunction5(addPackage), checkPrerequisites = js.Any.fromFunction3(checkPrerequisites), createAbortChannel = js.Any.fromFunction0(createAbortChannel), dispose = js.Any.fromFunction0(dispose), getContext = js.Any.fromFunction0(getContext), getDeployedPackage = js.Any.fromFunction3(getDeployedPackage), getDeployedPackages = js.Any.fromFunction2(getDeployedPackages), getExtensionsWithUnacceptedLicenses = js.Any.fromFunction1(getExtensionsWithUnacceptedLicenses), getSupportedPackageTypes = js.Any.fromFunction0(getSupportedPackageTypes), importExtension = js.Any.fromFunction3(importExtension), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), reinstallDeployedPackages = js.Any.fromFunction3(reinstallDeployedPackages), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePackage = js.Any.fromFunction4(removePackage), synchronize = js.Any.fromFunction2(synchronize))
    __obj.asInstanceOf[XPackageManager]
  }
  
  @scala.inline
  implicit class XPackageManagerOps[Self <: XPackageManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: String): Self = this.set("Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPackageTypes(value: SafeArray[XPackageTypeInfo]): Self = this.set("SupportedPackageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddPackage(value: (String, SeqEquiv[NamedValue], String, XAbortChannel, XCommandEnvironment) => XPackage): Self = this.set("addPackage", js.Any.fromFunction5(value))
    
    @scala.inline
    def setCheckPrerequisites(value: (XPackage, XAbortChannel, XCommandEnvironment) => Double): Self = this.set("checkPrerequisites", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateAbortChannel(value: () => XAbortChannel): Self = this.set("createAbortChannel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContext(value: () => String): Self = this.set("getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeployedPackage(value: (String, String, XCommandEnvironment) => XPackage): Self = this.set("getDeployedPackage", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetDeployedPackages(value: (XAbortChannel, XCommandEnvironment) => SafeArray[XPackage]): Self = this.set("getDeployedPackages", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetExtensionsWithUnacceptedLicenses(value: XCommandEnvironment => SafeArray[XPackage]): Self = this.set("getExtensionsWithUnacceptedLicenses", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSupportedPackageTypes(value: () => SafeArray[XPackageTypeInfo]): Self = this.set("getSupportedPackageTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportExtension(value: (XPackage, XAbortChannel, XCommandEnvironment) => XPackage): Self = this.set("importExtension", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReinstallDeployedPackages(value: (Boolean, XAbortChannel, XCommandEnvironment) => Unit): Self = this.set("reinstallDeployedPackages", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemovePackage(value: (String, String, XAbortChannel, XCommandEnvironment) => Unit): Self = this.set("removePackage", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSynchronize(value: (XAbortChannel, XCommandEnvironment) => Boolean): Self = this.set("synchronize", js.Any.fromFunction2(value))
  }
}

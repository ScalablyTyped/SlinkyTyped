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
import scala.scalajs.js.annotation._

/**
  * The {@link XExtensionManager} interface is used to manage extensions in the user, shared and bundled repository.
  * @see ExtensionManager
  * @since OOo 3.3
  */
@js.native
trait XExtensionManager
  extends XComponent
     with XModifyBroadcaster {
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  val SupportedPackageTypes: SafeArray[XPackageTypeInfo] = js.native
  /**
    * adds an extension.
    *
    * The properties argument is currently only used to suppress the license information for shared extensions.
    * @param url package URL, must be UCB conform
    * @param properties additional properties, for example, that the license is to be suppressed (if supported by the extension)
    * @param repository the name of the repository
    * @param xAbortChannel abort channel to asynchronously abort the adding process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns object representing the extension.
    */
  def addExtension(
    url: String,
    properties: SeqEquiv[NamedValue],
    repository: String,
    xAbortChannel: XAbortChannel,
    xCmdEnv: XCommandEnvironment
  ): XPackage = js.native
  /** check if all prerequisites for the extension are fulfilled and activates it, if possible. */
  def checkPrerequisitesAndEnable(extension: XPackage, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Double = js.native
  /**
    * creates a command channel to be used to asynchronously abort a command.
    * @returns abort channel
    */
  def createAbortChannel(): XAbortChannel = js.native
  /**
    * disable an extension.
    *
    * If the extension is not from the user repository then an IllegalArgumentException is thrown.
    * @param extension the extension which is to be disabled
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def disableExtension(extension: XPackage, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit = js.native
  /**
    * enable an extension.
    *
    * If the extension is not from the user repository then an IllegalArgumentException is thrown.
    * @param extension the extension which is to be enabled.
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def enableExtension(extension: XPackage, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit = js.native
  /**
    * returns a sequence containing all installed extensions.
    *
    * The members of the returned sequence correspond to an extension with a particular extension identifier. The members are also sequences which contain
    * as many elements as there are repositories. Those are ordered according to the priority of the repository. That is, the first member is the extension
    * from the user repository, the second is from the shared repository and the last is from the bundled repository.
    */
  def getAllExtensions(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): SafeArray[SafeArray[XPackage]] = js.native
  /**
    * gets an installed extensions.
    * @param repository the name of the repository
    * @param identifier extension identifier
    * @param fileName extension file name
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} object
    */
  def getDeployedExtension(repository: String, identifier: String, fileName: String, xCmdEnv: XCommandEnvironment): XPackage = js.native
  /**
    * gets all currently installed extensions, including disabled user extensions.
    * @param repository the repository from which the extensions are returned
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns all currently installed packages
    */
  def getDeployedExtensions(repository: String, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): SafeArray[XPackage] = js.native
  /**
    * gets all extensions with the same identifier from all repositories.
    *
    * The extension at the first position in the returned sequence represents the extension from the user repository. The next element is from the shared
    * and the last one is from the bundled repository. If one repository does not contain this extension, then the respective element is a null reference.
    */
  def getExtensionsWithSameIdentifier(identifier: String, fileName: String, xCmdEnv: XCommandEnvironment): SafeArray[XPackage] = js.native
  /**
    * returns all extensions which are currently not in use because the user did not accept the license.
    *
    * The function will not return any object for the user repository, because a user extension will not be kept in the user repository if its license is
    * declined. Only extensions which are registered at start-up of OOo, that is, shared and bundled extensions, can be returned.
    *
    * Extensions which allow the license to be suppressed, that is, it does not need to be displayed, and which are installed with the corresponding option,
    * are also not returned.
    *
    * Extensions returned by these functions are not returned by {@link XExtensionManager.getDeployedExtension()}{@link
    * XExtensionManager.getDeployedExtensions()}{@link XExtensionManager.getAllExtensions()}{@link XExtensionManager.getExtensionsWithSameIdentifier()}
    */
  def getExtensionsWithUnacceptedLicenses(repository: String, xCmdEnv: XCommandEnvironment): SafeArray[XPackage] = js.native
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  def getSupportedPackageTypes(): SafeArray[XPackageTypeInfo] = js.native
  /** determines if the current user has write access to the extensions folder of the repository. */
  def isReadOnlyRepository(repository: String): Boolean = js.native
  /**
    * Expert feature: erases the underlying registry cache and reinstalls all previously added extensions. Please keep in mind that all registration status
    * get lost.
    *
    * Please use this in case of suspected cache inconsistencies only.
    * @param force set to true when called during soffice bootstrap after cleaning old extension cache
    * @param repository the name of the repository
    * @param xAbortChannel abort channel to asynchronously abort the adding process
    * @param xCmdEnv command environment for error and progress handling
    */
  def reinstallDeployedExtensions(force: Boolean, repository: String, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit = js.native
  /**
    * removes an extension.
    * @param identifier package identifier
    * @param fileName package file name
    * @param repository the name of the repository
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def removeExtension(
    identifier: String,
    fileName: String,
    repository: String,
    xAbortChannel: XAbortChannel,
    xCmdEnv: XCommandEnvironment
  ): Unit = js.native
  /**
    * synchronizes the extension database with the contents of the extensions folder of shared and bundled extensions.
    *
    * Added extensions will be added to the database and removed extensions will be removed from the database. The active extensions are determined. That
    * is, shared or bundled extensions are not necessaryly registered ( {@link XPackage.registerPackage()} ).
    * @returns If true - then at least one extension was removed or added. Otherwise nothing was changed.
    */
  def synchronize(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Boolean = js.native
}

object XExtensionManager {
  @scala.inline
  def apply(
    SupportedPackageTypes: SafeArray[XPackageTypeInfo],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addExtension: (String, SeqEquiv[NamedValue], String, XAbortChannel, XCommandEnvironment) => XPackage,
    addModifyListener: XModifyListener => Unit,
    checkPrerequisitesAndEnable: (XPackage, XAbortChannel, XCommandEnvironment) => Double,
    createAbortChannel: () => XAbortChannel,
    disableExtension: (XPackage, XAbortChannel, XCommandEnvironment) => Unit,
    dispose: () => Unit,
    enableExtension: (XPackage, XAbortChannel, XCommandEnvironment) => Unit,
    getAllExtensions: (XAbortChannel, XCommandEnvironment) => SafeArray[SafeArray[XPackage]],
    getDeployedExtension: (String, String, String, XCommandEnvironment) => XPackage,
    getDeployedExtensions: (String, XAbortChannel, XCommandEnvironment) => SafeArray[XPackage],
    getExtensionsWithSameIdentifier: (String, String, XCommandEnvironment) => SafeArray[XPackage],
    getExtensionsWithUnacceptedLicenses: (String, XCommandEnvironment) => SafeArray[XPackage],
    getSupportedPackageTypes: () => SafeArray[XPackageTypeInfo],
    isReadOnlyRepository: String => Boolean,
    queryInterface: `type` => js.Any,
    reinstallDeployedExtensions: (Boolean, String, XAbortChannel, XCommandEnvironment) => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeExtension: (String, String, String, XAbortChannel, XCommandEnvironment) => Unit,
    removeModifyListener: XModifyListener => Unit,
    synchronize: (XAbortChannel, XCommandEnvironment) => Boolean
  ): XExtensionManager = {
    val __obj = js.Dynamic.literal(SupportedPackageTypes = SupportedPackageTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addExtension = js.Any.fromFunction5(addExtension), addModifyListener = js.Any.fromFunction1(addModifyListener), checkPrerequisitesAndEnable = js.Any.fromFunction3(checkPrerequisitesAndEnable), createAbortChannel = js.Any.fromFunction0(createAbortChannel), disableExtension = js.Any.fromFunction3(disableExtension), dispose = js.Any.fromFunction0(dispose), enableExtension = js.Any.fromFunction3(enableExtension), getAllExtensions = js.Any.fromFunction2(getAllExtensions), getDeployedExtension = js.Any.fromFunction4(getDeployedExtension), getDeployedExtensions = js.Any.fromFunction3(getDeployedExtensions), getExtensionsWithSameIdentifier = js.Any.fromFunction3(getExtensionsWithSameIdentifier), getExtensionsWithUnacceptedLicenses = js.Any.fromFunction2(getExtensionsWithUnacceptedLicenses), getSupportedPackageTypes = js.Any.fromFunction0(getSupportedPackageTypes), isReadOnlyRepository = js.Any.fromFunction1(isReadOnlyRepository), queryInterface = js.Any.fromFunction1(queryInterface), reinstallDeployedExtensions = js.Any.fromFunction4(reinstallDeployedExtensions), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeExtension = js.Any.fromFunction5(removeExtension), removeModifyListener = js.Any.fromFunction1(removeModifyListener), synchronize = js.Any.fromFunction2(synchronize))
    __obj.asInstanceOf[XExtensionManager]
  }
  @scala.inline
  implicit class XExtensionManagerOps[Self <: XExtensionManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportedPackageTypes(value: SafeArray[XPackageTypeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedPackageTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddExtension(value: (String, SeqEquiv[NamedValue], String, XAbortChannel, XCommandEnvironment) => XPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExtension")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCheckPrerequisitesAndEnable(value: (XPackage, XAbortChannel, XCommandEnvironment) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPrerequisitesAndEnable")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateAbortChannel(value: () => XAbortChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAbortChannel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableExtension(value: (XPackage, XAbortChannel, XCommandEnvironment) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExtension")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEnableExtension(value: (XPackage, XAbortChannel, XCommandEnvironment) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExtension")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetAllExtensions(value: (XAbortChannel, XCommandEnvironment) => SafeArray[SafeArray[XPackage]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllExtensions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDeployedExtension(value: (String, String, String, XCommandEnvironment) => XPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeployedExtension")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetDeployedExtensions(value: (String, XAbortChannel, XCommandEnvironment) => SafeArray[XPackage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeployedExtensions")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetExtensionsWithSameIdentifier(value: (String, String, XCommandEnvironment) => SafeArray[XPackage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtensionsWithSameIdentifier")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetExtensionsWithUnacceptedLicenses(value: (String, XCommandEnvironment) => SafeArray[XPackage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtensionsWithUnacceptedLicenses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSupportedPackageTypes(value: () => SafeArray[XPackageTypeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedPackageTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReadOnlyRepository(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnlyRepository")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReinstallDeployedExtensions(value: (Boolean, String, XAbortChannel, XCommandEnvironment) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reinstallDeployedExtensions")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRemoveExtension(value: (String, String, String, XAbortChannel, XCommandEnvironment) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeExtension")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSynchronize(value: (XAbortChannel, XCommandEnvironment) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


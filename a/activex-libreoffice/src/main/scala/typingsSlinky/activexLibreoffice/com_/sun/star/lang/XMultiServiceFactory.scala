package typingsSlinky.activexLibreoffice.com_.sun.star.lang

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows creating instances specified by a string name. */
@js.native
trait XMultiServiceFactory extends XInterface {
  
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  val AvailableServiceNames: SafeArray[String] = js.native
  
  /**
    * Creates an instance classified by the specified name.
    * @param aServiceSpecifier classified name of instance
    * @returns instance
    */
  def createInstance(aServiceSpecifier: String): XInterface = js.native
  def createInstance[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1364 */ js.Any */](aServiceSpecifier: K): /* import warning: importer.ImportType#apply Failed type conversion: activex-libreoffice.LibreOffice.ServicesNameMap[K] */ js.Any = js.native
  
  /**
    * Creates an instance classified by the specified name and passes the arguments to that instance.
    * @param ServiceSpecifier classified name of instance
    * @param Arguments arguments passed to the instance
    * @returns instance
    */
  def createInstanceWithArguments(ServiceSpecifier: String, Arguments: SeqEquiv[_]): XInterface = js.native
  def createInstanceWithArguments[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1364 */ js.Any */](ServiceSpecifier: K, Arguments: SeqEquiv[_]): /* import warning: importer.ImportType#apply Failed type conversion: activex-libreoffice.LibreOffice.ServicesNameMap[K] */ js.Any = js.native
  
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  def getAvailableServiceNames(): SafeArray[String] = js.native
}

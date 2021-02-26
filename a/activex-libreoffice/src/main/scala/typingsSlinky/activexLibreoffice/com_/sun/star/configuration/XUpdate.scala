package typingsSlinky.activexLibreoffice.com_.sun.star.configuration

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XUpdate extends StObject {
  
  def insertExtensionXcsFile(shared: Boolean, fileUri: String): Unit = js.native
  
  def insertExtensionXcuFile(shared: Boolean, fileUri: String): Unit = js.native
  
  def insertModificationXcuFile(fileUri: String, includedPaths: SeqEquiv[String], excludedPaths: SeqEquiv[String]): Unit = js.native
  
  def removeExtensionXcuFile(fileUri: String): Unit = js.native
}
object XUpdate {
  
  @scala.inline
  def apply(
    insertExtensionXcsFile: (Boolean, String) => Unit,
    insertExtensionXcuFile: (Boolean, String) => Unit,
    insertModificationXcuFile: (String, SeqEquiv[String], SeqEquiv[String]) => Unit,
    removeExtensionXcuFile: String => Unit
  ): XUpdate = {
    val __obj = js.Dynamic.literal(insertExtensionXcsFile = js.Any.fromFunction2(insertExtensionXcsFile), insertExtensionXcuFile = js.Any.fromFunction2(insertExtensionXcuFile), insertModificationXcuFile = js.Any.fromFunction3(insertModificationXcuFile), removeExtensionXcuFile = js.Any.fromFunction1(removeExtensionXcuFile))
    __obj.asInstanceOf[XUpdate]
  }
  
  @scala.inline
  implicit class XUpdateMutableBuilder[Self <: XUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertExtensionXcsFile(value: (Boolean, String) => Unit): Self = StObject.set(x, "insertExtensionXcsFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertExtensionXcuFile(value: (Boolean, String) => Unit): Self = StObject.set(x, "insertExtensionXcuFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertModificationXcuFile(value: (String, SeqEquiv[String], SeqEquiv[String]) => Unit): Self = StObject.set(x, "insertModificationXcuFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveExtensionXcuFile(value: String => Unit): Self = StObject.set(x, "removeExtensionXcuFile", js.Any.fromFunction1(value))
  }
}

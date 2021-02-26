package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.anon.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldEntity extends StObject {
  
  def getErrors(): js.Array[String] = js.native
  
  def getMeta(): Meta = js.native
  
  def getNamePath(): InternalNamePath = js.native
  
  def isFieldDirty(): Boolean = js.native
  
  def isFieldTouched(): Boolean = js.native
  
  def isFieldValidating(): Boolean = js.native
  
  def isList(): Boolean = js.native
  
  def isListField(): Boolean = js.native
  
  def onStoreChange(store: Store, namePathList: js.Array[InternalNamePath], info: ValuedNotifyInfo): Unit = js.native
  def onStoreChange(store: Store, namePathList: Null, info: ValuedNotifyInfo): Unit = js.native
  
  var props: Dependencies = js.native
  
  def validateRules(): js.Promise[js.Array[String]] = js.native
  def validateRules(options: ValidateOptions): js.Promise[js.Array[String]] = js.native
}

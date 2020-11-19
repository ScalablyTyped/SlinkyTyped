package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInView
import typingsSlinky.mfiles.MFiles.MFFolderDefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderDef extends js.Object {
  
  def Clone(): IFolderDef = js.native
  
  val FolderDefType: MFFolderDefType = js.native
  
  val PropertyFolder: ITypedValue = js.native
  
  val SearchDef: ISearchDef = js.native
  
  def SetPropertyFolder(TypedValue: ITypedValue): Unit = js.native
  
  def SetSearchDef(SearchDef: ISearchDef): Unit = js.native
  
  def SetTraditionalFolder(TraditionalFolder: Double): Unit = js.native
  
  def SetView(View: Double): Unit = js.native
  def SetView(View: MFBuiltInView): Unit = js.native
  
  val TraditionalFolder: Double = js.native
  
  val View: MFBuiltInView | Double = js.native
}

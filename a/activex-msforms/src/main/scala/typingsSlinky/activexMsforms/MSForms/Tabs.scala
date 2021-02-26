package typingsSlinky.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tabs extends StObject {
  
  def apply(varg: js.Any): js.Any = js.native
  
  def Add(): Tab = js.native
  def Add(bstrName: js.UndefOr[scala.Nothing], bstrCaption: js.UndefOr[scala.Nothing], lIndex: js.Any): Tab = js.native
  def Add(bstrName: js.UndefOr[scala.Nothing], bstrCaption: js.Any): Tab = js.native
  def Add(bstrName: js.UndefOr[scala.Nothing], bstrCaption: js.Any, lIndex: js.Any): Tab = js.native
  def Add(bstrName: js.Any): Tab = js.native
  def Add(bstrName: js.Any, bstrCaption: js.UndefOr[scala.Nothing], lIndex: js.Any): Tab = js.native
  def Add(bstrName: js.Any, bstrCaption: js.Any): Tab = js.native
  def Add(bstrName: js.Any, bstrCaption: js.Any, lIndex: js.Any): Tab = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  def Enum(): js.Any = js.native
  
  def Item(varg: js.Any): js.Any = js.native
  
  def Remove(varg: js.Any): Unit = js.native
  
  def _Add(bstrName: String, bstrCaption: String): Tab = js.native
  
  def _GetItemByIndex(lIndex: Double): Tab = js.native
  
  def _GetItemByName(bstr: String): Tab = js.native
  
  def _Insert(bstrName: String, bstrCaption: String, lIndex: Double): Tab = js.native
}

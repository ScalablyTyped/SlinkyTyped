package typingsSlinky.androiduix.android.view

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutInflater extends js.Object {
  
  def getContext(): Context = js.native
  
  def inflate(layout: String): View = js.native
  def inflate(layout: String, viewParent: js.UndefOr[scala.Nothing], attachToRoot: Boolean): View = js.native
  def inflate(layout: String, viewParent: ViewGroup): View = js.native
  def inflate(layout: String, viewParent: ViewGroup, attachToRoot: Boolean): View = js.native
  def inflate(layout: HTMLElement): View = js.native
  def inflate(layout: HTMLElement, viewParent: js.UndefOr[scala.Nothing], attachToRoot: Boolean): View = js.native
  def inflate(layout: HTMLElement, viewParent: ViewGroup): View = js.native
  def inflate(layout: HTMLElement, viewParent: ViewGroup, attachToRoot: Boolean): View = js.native
  
  var mContext: Context = js.native
}

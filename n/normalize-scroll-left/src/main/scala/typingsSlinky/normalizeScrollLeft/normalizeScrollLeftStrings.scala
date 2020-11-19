package typingsSlinky.normalizeScrollLeft

import typingsSlinky.normalizeScrollLeft.mod.ScrollType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeScrollLeftStrings {
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def indeterminate: indeterminate = "indeterminate".asInstanceOf[indeterminate]
  
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @scala.inline
  def negative: negative = "negative".asInstanceOf[negative]
  
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait default extends ScrollType
  
  @js.native
  sealed trait indeterminate extends ScrollType
  
  @js.native
  sealed trait ltr extends js.Object
  
  @js.native
  sealed trait negative extends ScrollType
  
  @js.native
  sealed trait reverse extends ScrollType
  
  @js.native
  sealed trait rtl extends js.Object
}

package typingsSlinky.antDesignProUtils

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antDesignProUtils.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelIconTipMod extends Shortcut {
  
  /**
    * 在 form 的 label 后面增加一个 tips 来展示一些说明文案
    * @param props
    */
  @JSImport("@ant-design/pro-utils/lib/components/LabelIconTip", JSImport.Default)
  @js.native
  val default: ReactComponentClass[Label] = js.native
  
  type _To = ReactComponentClass[Label]
  
  /* This means you don't have to write `default`, but can instead just say `labelIconTipMod.foo` */
  override def _to: ReactComponentClass[Label] = default
}

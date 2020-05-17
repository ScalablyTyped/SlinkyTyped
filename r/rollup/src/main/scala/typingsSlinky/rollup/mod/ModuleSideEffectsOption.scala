package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.rollup.rollupStrings.`no-external`
  - js.Array[java.lang.String]
  - typingsSlinky.rollup.mod.HasModuleSideEffects
*/
trait ModuleSideEffectsOption extends js.Object

object ModuleSideEffectsOption {
  @scala.inline
  def `no-external`: typingsSlinky.rollup.rollupStrings.`no-external` = "no-external".asInstanceOf[typingsSlinky.rollup.rollupStrings.`no-external`]
  @scala.inline
  implicit def apply(value: js.Array[String]): ModuleSideEffectsOption = value.asInstanceOf[ModuleSideEffectsOption]
  @scala.inline
  implicit def apply(value: Boolean): ModuleSideEffectsOption = value.asInstanceOf[ModuleSideEffectsOption]
  @scala.inline
  implicit def apply(value: HasModuleSideEffects): ModuleSideEffectsOption = value.asInstanceOf[ModuleSideEffectsOption]
}


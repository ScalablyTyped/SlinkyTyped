package typingsSlinky.pixiJs.anon

import typingsSlinky.pixiJs.PIXI.Extract
import typingsSlinky.pixiJs.PIXI.Prepare
import typingsSlinky.pixiJs.PIXI.accessibility.AccessibilityManager
import typingsSlinky.pixiJs.PIXI.interaction.InteractionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accessibility extends js.Object {
  var accessibility: AccessibilityManager
  var extract: Extract
  var interaction: InteractionManager
  var prepare: Prepare
}

object Accessibility {
  @scala.inline
  def apply(
    accessibility: AccessibilityManager,
    extract: Extract,
    interaction: InteractionManager,
    prepare: Prepare
  ): Accessibility = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], extract = extract.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], prepare = prepare.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessibility]
  }
}


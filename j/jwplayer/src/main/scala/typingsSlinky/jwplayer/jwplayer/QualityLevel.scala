package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.`initial choice`
import typingsSlinky.jwplayer.jwplayerStrings.api
import typingsSlinky.jwplayer.jwplayerStrings.auto
import typingsSlinky.jwplayer.jwplayerStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualityLevel extends js.Object {
  var level: Level
  var mode: auto | manual
  var reason: auto | api | (`initial choice`)
}

object QualityLevel {
  @scala.inline
  def apply(level: Level, mode: auto | manual, reason: auto | api | (`initial choice`)): QualityLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualityLevel]
  }
}


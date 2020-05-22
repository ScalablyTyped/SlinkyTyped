package typingsSlinky.apolloEngineReporting.anon

import typingsSlinky.apolloEngineReporting.agentMod.SendValuesBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptNames extends SendValuesBaseOptions {
  var exceptNames: js.Array[String]
}

object ExceptNames {
  @scala.inline
  def apply(exceptNames: js.Array[String]): ExceptNames = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptNames]
  }
}


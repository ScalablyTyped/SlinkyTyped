package typingsSlinky.hafasClient.mod

import typingsSlinky.hafasClient.hafasClientStrings.aircraft
import typingsSlinky.hafasClient.hafasClientStrings.bicycle
import typingsSlinky.hafasClient.hafasClientStrings.bus
import typingsSlinky.hafasClient.hafasClientStrings.car
import typingsSlinky.hafasClient.hafasClientStrings.gondola
import typingsSlinky.hafasClient.hafasClientStrings.route
import typingsSlinky.hafasClient.hafasClientStrings.taxi
import typingsSlinky.hafasClient.hafasClientStrings.train
import typingsSlinky.hafasClient.hafasClientStrings.walking
import typingsSlinky.hafasClient.hafasClientStrings.watercraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var id: String
  var line: String
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking
  var stops: js.Array[String]
  var `type`: route
}

object Route {
  @scala.inline
  def apply(
    id: String,
    line: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    stops: js.Array[String],
    `type`: route
  ): Route = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}


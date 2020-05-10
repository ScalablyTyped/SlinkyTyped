package typingsSlinky.dojo.dojo.main

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.mouseButtons.html
  *
  *
  */
@js.native
trait mouseButtons extends js.Object {
  /**
    * Numeric value of the left mouse button for the platform.
    *
    */
  var LEFT: Double = js.native
  /**
    * Numeric value of the middle mouse button for the platform.
    *
    */
  var MIDDLE: Double = js.native
  /**
    * Numeric value of the right mouse button for the platform.
    *
    */
  var RIGHT: Double = js.native
  /**
    * Checks an event object for a pressed button
    *
    * @param e Event object to examine
    * @param button The button value (example: dojo.mouseButton.LEFT)
    */
  def isButton(e: Event_, button: Double): Boolean = js.native
  /**
    * Checks an event object for the pressed left button
    *
    * @param e Event object to examine
    */
  def isLeft(e: Event_): Boolean = js.native
  /**
    * Checks an event object for the pressed middle button
    *
    * @param e Event object to examine
    */
  def isMiddle(e: Event_): Boolean = js.native
  /**
    * Checks an event object for the pressed right button
    *
    * @param e Event object to examine
    */
  def isRight(e: Event_): Boolean = js.native
}

object mouseButtons {
  @scala.inline
  def apply(
    LEFT: Double,
    MIDDLE: Double,
    RIGHT: Double,
    isButton: (Event_, Double) => Boolean,
    isLeft: Event_ => Boolean,
    isMiddle: Event_ => Boolean,
    isRight: Event_ => Boolean
  ): mouseButtons = {
    val __obj = js.Dynamic.literal(LEFT = LEFT.asInstanceOf[js.Any], MIDDLE = MIDDLE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], isButton = js.Any.fromFunction2(isButton), isLeft = js.Any.fromFunction1(isLeft), isMiddle = js.Any.fromFunction1(isMiddle), isRight = js.Any.fromFunction1(isRight))
    __obj.asInstanceOf[mouseButtons]
  }
  @scala.inline
  implicit class mouseButtonsOps[Self <: mouseButtons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLEFT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIDDLE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIDDLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIGHT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsButton(value: (Event_, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButton")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsLeft(value: Event_ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMiddle(value: Event_ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMiddle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRight(value: Event_ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRight")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


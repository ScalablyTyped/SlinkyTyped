package typingsSlinky.cliBoxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	All box styles.
	*/
@js.native
trait Boxes extends js.Object {
  /**
  		@example
  		```
  		┏━━━━┓
  		┃    ┃
  		┗━━━━┛
  		```
  		*/
  val bold: BoxStyle = js.native
  /**
  		@example
  		```
  		+----+
  		|    |
  		+----+
  		```
  		*/
  val classic: BoxStyle = js.native
  /**
  		@example
  		```
  		╔════╗
  		║    ║
  		╚════╝
  		```
  		*/
  val double: BoxStyle = js.native
  /**
  		@example
  		```
  		╒════╕
  		│    │
  		╘════╛
  		```
  		*/
  val doubleSingle: BoxStyle = js.native
  /**
  		@example
  		```
  		╭────╮
  		│    │
  		╰────╯
  		```
  		*/
  val round: BoxStyle = js.native
  /**
  		@example
  		```
  		┌────┐
  		│    │
  		└────┘
  		```
  		*/
  val single: BoxStyle = js.native
  /**
  		@example
  		```
  		╓────╖
  		║    ║
  		╙────╜
  		```
  		*/
  val singleDouble: BoxStyle = js.native
}

object Boxes {
  @scala.inline
  def apply(
    bold: BoxStyle,
    classic: BoxStyle,
    double: BoxStyle,
    doubleSingle: BoxStyle,
    round: BoxStyle,
    single: BoxStyle,
    singleDouble: BoxStyle
  ): Boxes = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], classic = classic.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], doubleSingle = doubleSingle.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], singleDouble = singleDouble.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boxes]
  }
  @scala.inline
  implicit class BoxesOps[Self <: Boxes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: BoxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassic(value: BoxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDouble(value: BoxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("double")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubleSingle(value: BoxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleSingle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRound(value: BoxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingle(value: BoxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleDouble(value: BoxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleDouble")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


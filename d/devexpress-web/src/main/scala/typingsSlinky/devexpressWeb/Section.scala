package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section in the document.
  */
@js.native
trait Section extends js.Object {
  /**
    * Provides access to the section's footers.
    */
  val footers: js.Array[HeaderFooter] = js.native
  /**
    * Provides access to the section's headers.
    */
  val headers: js.Array[HeaderFooter] = js.native
  /**
    * Gets the text buffer interval occupied by the current section element.
    */
  val interval: Interval = js.native
  /**
    * Gets the section's character length.
    */
  val length: Double = js.native
  /**
    * Gets the section's start position in the document.
    */
  val start: Double = js.native
}

object Section {
  @scala.inline
  def apply(
    footers: js.Array[HeaderFooter],
    headers: js.Array[HeaderFooter],
    interval: Interval,
    length: Double,
    start: Double
  ): Section = {
    val __obj = js.Dynamic.literal(footers = footers.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  @scala.inline
  implicit class SectionOps[Self <: Section] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooters(value: js.Array[HeaderFooter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[HeaderFooter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.cleanCss.mod

import typingsSlinky.cleanCss.AnonEfficiency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output returned when calling minify functions
  */
@js.native
trait Output extends js.Object {
  /**
    * A list of errors raised
    */
  var errors: js.Array[String] = js.native
  /**
    * Output source map if requested with `sourceMap` option
    */
  var sourceMap: String = js.native
  /**
    * Contains statistics on the minify process
    */
  var stats: AnonEfficiency = js.native
  /**
    * Optimized output CSS as a string
    */
  var styles: String = js.native
  /**
    * A list of warnings raised
    */
  var warnings: js.Array[String] = js.native
}

object Output {
  @scala.inline
  def apply(
    errors: js.Array[String],
    sourceMap: String,
    stats: AnonEfficiency,
    styles: String,
    warnings: js.Array[String]
  ): Output = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: AnonEfficiency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


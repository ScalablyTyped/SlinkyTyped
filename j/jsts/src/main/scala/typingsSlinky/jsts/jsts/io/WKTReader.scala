package typingsSlinky.jsts.jsts.io

import typingsSlinky.jsts.jsts.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WKTReader extends js.Object {
  /**
    * Reads a Well-Known Text representation of a {@link Geometry}
    *
    * @param {string}
    *          wkt a <Geometry Tagged Text> string (see the OpenGIS Simple Features
    *          Specification).
    * @return {jsts.geom.Geometry} a <code>Geometry</code> read from
    *         <code>string.</code>
    */
  def read(wkt: String): Geometry = js.native
  def reducePrecision(geometry: Geometry): Unit = js.native
}

object WKTReader {
  @scala.inline
  def apply(read: String => Geometry, reducePrecision: Geometry => Unit): WKTReader = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), reducePrecision = js.Any.fromFunction1(reducePrecision))
    __obj.asInstanceOf[WKTReader]
  }
  @scala.inline
  implicit class WKTReaderOps[Self <: WKTReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: String => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReducePrecision(value: Geometry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducePrecision")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.node.streamMod

import typingsSlinky.node.anon.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableOptions extends js.Object {
  var autoDestroy: js.UndefOr[Boolean] = js.native
  var decodeStrings: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[String] = js.native
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  var emitClose: js.UndefOr[Boolean] = js.native
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var highWaterMark: js.UndefOr[Double] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
}

object WritableOptions {
  @scala.inline
  def apply(): WritableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritableOptions]
  }
  @scala.inline
  implicit class WritableOptionsOps[Self <: WritableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(
      value: js.ThisFunction2[
          /* this */ Writable, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitClose")(js.undefined)
        ret
    }
    @scala.inline
    def withFinal(
      value: js.ThisFunction1[
          /* this */ Writable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final")(js.undefined)
        ret
    }
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(
      value: js.ThisFunction3[
          /* this */ Writable, 
          /* chunk */ js.Any, 
          /* encoding */ String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
    @scala.inline
    def withWritev(
      value: js.ThisFunction2[
          /* this */ Writable, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writev")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.node.streamMod

import typingsSlinky.node.anon.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.node.streamMod.WritableOptions because var conflicts: autoDestroy, destroy, highWaterMark, objectMode. Inlined decodeStrings, defaultEncoding, emitClose, write, writev, `final` */ @js.native
trait DuplexOptions extends ReadableOptions {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var decodeStrings: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[String] = js.native
  @JSName("destroy")
  var destroy_DuplexOptions: js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  var emitClose: js.UndefOr[Boolean] = js.native
  var `final`: js.UndefOr[
    js.ThisFunction1[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  @JSName("read")
  var read_DuplexOptions: js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]] = js.native
  var readableHighWaterMark: js.UndefOr[Double] = js.native
  var readableObjectMode: js.UndefOr[Boolean] = js.native
  var writableCorked: js.UndefOr[Double] = js.native
  var writableHighWaterMark: js.UndefOr[Double] = js.native
  var writableObjectMode: js.UndefOr[Boolean] = js.native
  var write: js.UndefOr[
    js.ThisFunction3[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var writev: js.UndefOr[
    js.ThisFunction2[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
}

object DuplexOptions {
  @scala.inline
  def apply(): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplexOptions]
  }
  @scala.inline
  implicit class DuplexOptionsOps[Self <: DuplexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHalfOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHalfOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHalfOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHalfOpen")(js.undefined)
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
          /* this */ Duplex, 
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
          (/* this */ Duplex) | (/* this */ Writable), 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
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
    def withRead(value: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withReadableHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableHighWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadableHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableHighWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withReadableObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableObjectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadableObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableObjectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWritableCorked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableCorked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritableCorked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableCorked")(js.undefined)
        ret
    }
    @scala.inline
    def withWritableHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableHighWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritableHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableHighWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withWritableObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableObjectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritableObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableObjectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(
      value: js.ThisFunction3[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunk */ js.Any, 
          /* encoding */ String, 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
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
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
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


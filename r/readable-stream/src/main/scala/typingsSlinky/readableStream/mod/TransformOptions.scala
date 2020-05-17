package typingsSlinky.readableStream.mod

import typingsSlinky.readableStream.anon.Chunk
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_transform ====
/* Inlined readable-stream.readable-stream.DuplexOptions & {  read ? :(this : readable-stream.readable-stream.Transform, size : number): void,   write ? :(this : readable-stream.readable-stream.Transform, chunk : any, encoding : string, callback : (error ? : std.Error | null): void): void,   writev ? :(this : readable-stream.readable-stream.Transform, chunks : std.Array<{  chunk  :any,   encoding  :string}>, callback : (error ? : std.Error | null): void): void,   final ? :(this : readable-stream.readable-stream.Transform, callback : (error ? : std.Error | null): void): void,   destroy ? :(this : readable-stream.readable-stream.Transform, error : std.Error | null, callback : (error : std.Error | null): void): void,   transform ? :(this : readable-stream.readable-stream.Transform, chunk : any, encoding : string, callback : (error ? : std.Error, data ? : any): void): void,   flush ? :(this : readable-stream.readable-stream.Transform, callback : (er : any, data : any): void): void} */
@js.native
trait TransformOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var decodeStrings: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[String] = js.native
  var destroy: js.UndefOr[
    (js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Writable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Transform, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ])
  ] = js.native
  var encoding: js.UndefOr[String] = js.native
  var `final`: js.UndefOr[
    (js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ])
  ] = js.native
  var flush: js.UndefOr[
    js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function2[/* er */ js.Any, /* data */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var highWaterMark: js.UndefOr[Double] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[
    (js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit])
  ] = js.native
  var readable: js.UndefOr[Boolean] = js.native
  var readableHighWaterMark: js.UndefOr[Double] = js.native
  var readableObjectMode: js.UndefOr[Boolean] = js.native
  var transform: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
  var writable: js.UndefOr[Boolean] = js.native
  var writableHighWaterMark: js.UndefOr[Double] = js.native
  var writableObjectMode: js.UndefOr[Boolean] = js.native
  var write: js.UndefOr[
    (js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ])
  ] = js.native
  var writev: js.UndefOr[
    (js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]) with (js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ])
  ] = js.native
}

object TransformOptions {
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
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
      value: (js.ThisFunction2[
          /* this */ _Readable, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]) with (js.ThisFunction2[
          /* this */ Writable, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]) with (js.ThisFunction2[
          /* this */ Duplex, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]) with (js.ThisFunction2[
          /* this */ Transform, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ])
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
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFinal(
      value: (js.ThisFunction1[
          /* this */ Writable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]) with (js.ThisFunction1[
          /* this */ Duplex, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]) with (js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ])
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
    def withFlush(
      value: js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function2[/* er */ js.Any, /* data */ js.Any, Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
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
    def withRead(
      value: (js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]) with (js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit])
    ): Self = {
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
    def withReadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readable")(js.undefined)
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
    def withTransform(
      value: js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ String, 
          /* callback */ js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withWritable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(js.undefined)
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
      value: (js.ThisFunction3[
          /* this */ Writable, 
          /* chunk */ js.Any, 
          /* encoding */ String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]) with (js.ThisFunction3[
          /* this */ Duplex, 
          /* chunk */ js.Any, 
          /* encoding */ String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]) with (js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ])
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
      value: (js.ThisFunction2[
          /* this */ Writable, 
          /* chunk */ ArrayLike[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]) with (js.ThisFunction2[
          /* this */ Duplex, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]) with (js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ])
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


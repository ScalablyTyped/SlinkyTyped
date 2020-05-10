package typingsSlinky.readableStream.mod

import typingsSlinky.node.stringDecoderMod.StringDecoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableState extends js.Object {
  var awaitDrain: Double = js.native
  var buffer: BufferList[_] = js.native
  var decoder: StringDecoder | Null = js.native
  var defaultEncoding: String = js.native
  var destroyed: Boolean = js.native
  var emittedReadable: Boolean = js.native
  var encoding: String | Null = js.native
  var endEmitted: Boolean = js.native
  var ended: Boolean = js.native
  var flowing: js.Any = js.native
  var highWaterMark: Double = js.native
  var length: Double = js.native
  var needReadable: Boolean = js.native
  var objectMode: Boolean = js.native
  var pipes: js.Any = js.native
   // NodeJS.WritableStream | any[]; // TODO
  var pipesCount: Double = js.native
  var readableListening: Boolean = js.native
  var reading: Boolean = js.native
  var readingMore: Boolean = js.native
  var resumeScheduled: Boolean = js.native
  var sync: Boolean = js.native
}

object ReadableState {
  @scala.inline
  def apply(
    awaitDrain: Double,
    buffer: BufferList[_],
    defaultEncoding: String,
    destroyed: Boolean,
    emittedReadable: Boolean,
    endEmitted: Boolean,
    ended: Boolean,
    flowing: js.Any,
    highWaterMark: Double,
    length: Double,
    needReadable: Boolean,
    objectMode: Boolean,
    pipes: js.Any,
    pipesCount: Double,
    readableListening: Boolean,
    reading: Boolean,
    readingMore: Boolean,
    resumeScheduled: Boolean,
    sync: Boolean
  ): ReadableState = {
    val __obj = js.Dynamic.literal(awaitDrain = awaitDrain.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], defaultEncoding = defaultEncoding.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], emittedReadable = emittedReadable.asInstanceOf[js.Any], endEmitted = endEmitted.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], flowing = flowing.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], needReadable = needReadable.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], pipesCount = pipesCount.asInstanceOf[js.Any], readableListening = readableListening.asInstanceOf[js.Any], reading = reading.asInstanceOf[js.Any], readingMore = readingMore.asInstanceOf[js.Any], resumeScheduled = resumeScheduled.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableState]
  }
  @scala.inline
  implicit class ReadableStateOps[Self <: ReadableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwaitDrain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitDrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: BufferList[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmittedReadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emittedReadable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndEmitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEmitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedReadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needReadable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadableListening(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableListening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadingMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeScheduled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeScheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoder(value: StringDecoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(null)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(null)
        ret
    }
  }
  
}


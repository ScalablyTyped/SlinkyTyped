package typingsSlinky.readableStream.mod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableState extends js.Object {
  
  var awaitDrain: Double = js.native
  
  var buffer: BufferList[_] = js.native
  
  var decoder: StringDecoder | Null = js.native
  
  var defaultEncoding: BufferEncoding = js.native
  
  var destroyed: Boolean = js.native
  
  var emittedReadable: Boolean = js.native
  
  var encoding: BufferEncoding | Null = js.native
  
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
    defaultEncoding: BufferEncoding,
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwaitDrain(value: Double): Self = this.set("awaitDrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: BufferList[_]): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittedReadable(value: Boolean): Self = this.set("emittedReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndEmitted(value: Boolean): Self = this.set("endEmitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnded(value: Boolean): Self = this.set("ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowing(value: js.Any): Self = this.set("flowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedReadable(value: Boolean): Self = this.set("needReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipes(value: js.Any): Self = this.set("pipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipesCount(value: Double): Self = this.set("pipesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableListening(value: Boolean): Self = this.set("readableListening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReading(value: Boolean): Self = this.set("reading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingMore(value: Boolean): Self = this.set("readingMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeScheduled(value: Boolean): Self = this.set("resumeScheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoder(value: StringDecoder): Self = this.set("decoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoderNull: Self = this.set("decoder", null)
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
  }
}

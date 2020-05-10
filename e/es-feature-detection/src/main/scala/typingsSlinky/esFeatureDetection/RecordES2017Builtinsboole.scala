package typingsSlinky.esFeatureDetection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2017Builtins, boolean> */
@js.native
trait RecordES2017Builtinsboole extends js.Object {
  var Atomics: Boolean = js.native
  @JSName("Object.entries")
  var ObjectDotentries: Boolean = js.native
  @JSName("Object.getOwnPropertyDescriptors")
  var ObjectDotgetOwnPropertyDescriptors: Boolean = js.native
  @JSName("Object.values")
  var ObjectDotvalues: Boolean = js.native
  var SharedArrayBuffer: Boolean = js.native
  @JSName("String.prototype.padEnd")
  var StringDotprototypeDotpadEnd: Boolean = js.native
  @JSName("String.prototype.padStart")
  var StringDotprototypeDotpadStart: Boolean = js.native
  var __all: Boolean = js.native
}

object RecordES2017Builtinsboole {
  @scala.inline
  def apply(
    Atomics: Boolean,
    ObjectDotentries: Boolean,
    ObjectDotgetOwnPropertyDescriptors: Boolean,
    ObjectDotvalues: Boolean,
    SharedArrayBuffer: Boolean,
    StringDotprototypeDotpadEnd: Boolean,
    StringDotprototypeDotpadStart: Boolean,
    __all: Boolean
  ): RecordES2017Builtinsboole = {
    val __obj = js.Dynamic.literal(Atomics = Atomics.asInstanceOf[js.Any], SharedArrayBuffer = SharedArrayBuffer.asInstanceOf[js.Any], __all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Object.entries")(ObjectDotentries.asInstanceOf[js.Any])
    __obj.updateDynamic("Object.getOwnPropertyDescriptors")(ObjectDotgetOwnPropertyDescriptors.asInstanceOf[js.Any])
    __obj.updateDynamic("Object.values")(ObjectDotvalues.asInstanceOf[js.Any])
    __obj.updateDynamic("String.prototype.padEnd")(StringDotprototypeDotpadEnd.asInstanceOf[js.Any])
    __obj.updateDynamic("String.prototype.padStart")(StringDotprototypeDotpadStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2017Builtinsboole]
  }
  @scala.inline
  implicit class RecordES2017BuiltinsbooleOps[Self <: RecordES2017Builtinsboole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtomics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Atomics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectDotentries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object.entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectDotgetOwnPropertyDescriptors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object.getOwnPropertyDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectDotvalues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object.values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedArrayBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedArrayBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringDotprototypeDotpadEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("String.prototype.padEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringDotprototypeDotpadStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("String.prototype.padStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__all")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


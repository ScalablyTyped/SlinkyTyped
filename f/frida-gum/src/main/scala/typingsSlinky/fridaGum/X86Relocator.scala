package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relocates machine code for x86.
  */
@js.native
trait X86Relocator extends js.Object {
  /**
    * Indicates whether end-of-block has been reached, i.e. we've
    * reached a branch of any kind, like CALL, JMP, BL, RET.
    */
  var eob: Boolean = js.native
  /**
    * Indicates whether end-of-input has been reached, e.g. we've
    * reached JMP/B/RET, an instruction after which there may or may
    * not be valid code.
    */
  var eoi: Boolean = js.native
  /**
    * Latest `Instruction` read so far. Starts out `null` and changes
    * on every call to `readOne()`.
    */
  var input: Instruction | Null = js.native
  /**
    * Eagerly cleans up memory.
    */
  def dispose(): Unit = js.native
  /**
    * Peeks at the next `Instruction` to be written or skipped.
    */
  def peekNextWriteInsn(): Instruction | Null = js.native
  /**
    * Peeks at the address of the next instruction to be written or skipped.
    */
  def peekNextWriteSource(): NativePointer = js.native
  /**
    * Reads the next instruction into the relocator's internal buffer
    * and returns the number of bytes read so far, including previous
    * calls.
    *
    * You may keep calling this method to keep buffering, or immediately
    * call either `writeOne()` or `skipOne()`. Or, you can buffer up
    * until the desired point and then call `writeAll()`.
    *
    * Returns zero when end-of-input is reached, which means the `eoi`
    * property is now `true`.
    */
  def readOne(): Double = js.native
  /**
    * Recycles instance.
    */
  def reset(inputCode: NativePointerValue, output: X86Writer): Unit = js.native
  /**
    * Skips the instruction that would have been written next.
    */
  def skipOne(): Unit = js.native
  /**
    * Skips the instruction that would have been written next,
    * but without a label for internal use. This breaks relocation of branches to
    * locations inside the relocated range, and is an optimization for use-cases
    * where all branches are rewritten (e.g. Frida's Stalker).
    */
  def skipOneNoLabel(): Unit = js.native
  /**
    * Writes all buffered instructions.
    */
  def writeAll(): Unit = js.native
  /**
    * write the next buffered instruction.
    */
  def writeOne(): Boolean = js.native
  /**
    * write the next buffered instruction, but without a
    * label for internal use. This breaks relocation of branches to locations
    * inside the relocated range, and is an optimization for use-cases where all
    * branches are rewritten (e.g. Frida's Stalker).
    */
  def writeOneNoLabel(): Boolean = js.native
}

object X86Relocator {
  @scala.inline
  def apply(
    dispose: () => Unit,
    eob: Boolean,
    eoi: Boolean,
    peekNextWriteInsn: () => Instruction | Null,
    peekNextWriteSource: () => NativePointer,
    readOne: () => Double,
    reset: (NativePointerValue, X86Writer) => Unit,
    skipOne: () => Unit,
    skipOneNoLabel: () => Unit,
    writeAll: () => Unit,
    writeOne: () => Boolean,
    writeOneNoLabel: () => Boolean
  ): X86Relocator = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), eob = eob.asInstanceOf[js.Any], eoi = eoi.asInstanceOf[js.Any], peekNextWriteInsn = js.Any.fromFunction0(peekNextWriteInsn), peekNextWriteSource = js.Any.fromFunction0(peekNextWriteSource), readOne = js.Any.fromFunction0(readOne), reset = js.Any.fromFunction2(reset), skipOne = js.Any.fromFunction0(skipOne), skipOneNoLabel = js.Any.fromFunction0(skipOneNoLabel), writeAll = js.Any.fromFunction0(writeAll), writeOne = js.Any.fromFunction0(writeOne), writeOneNoLabel = js.Any.fromFunction0(writeOneNoLabel))
    __obj.asInstanceOf[X86Relocator]
  }
  @scala.inline
  implicit class X86RelocatorOps[Self <: X86Relocator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEoi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eoi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeekNextWriteInsn(value: () => Instruction | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekNextWriteInsn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeekNextWriteSource(value: () => NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekNextWriteSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadOne(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOne")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: (NativePointerValue, X86Writer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSkipOne(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOne")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSkipOneNoLabel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOneNoLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWriteAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWriteOne(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeOne")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWriteOneNoLabel(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeOneNoLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInput(value: Instruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(null)
        ret
    }
  }
  
}


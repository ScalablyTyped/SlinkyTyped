package typingsSlinky.activexLibreoffice.LibreOffice

import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]any`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]boolean`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]byte`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]char`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]double`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]float`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]long`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]object`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]short`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]string`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]unsigned long`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]unsigned short`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[][]unsigned`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]any`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]boolean`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]byte`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]char`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]double`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]float`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]long`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]object`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]short`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]string`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]unsigned long`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]unsigned short`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`[]unsigned`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`object`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`unsigned long`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.`unsigned short`
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.any
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.boolean
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.byte
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.char
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.double
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.float
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.long
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.short
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.string
import typingsSlinky.activexLibreoffice.activexLibreofficeStrings.unsigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueObject extends js.Object {
  /** Returns the value contained in the object, when the Value Object was used as an `inout` or `out` parameter */
  def Get(): js.Any = js.native
  /** Initialize the object as an `inout` parameter */
  def InitInOutParam(
    `type`: `[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`),
    value: js.Any
  ): Unit = js.native
  /** Initialize the object as an `out` parameter */
  def InitOutParam(): Unit = js.native
  /** Assigns a type and a value */
  def Set(
    `type`: `[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`),
    value: js.Any
  ): Unit = js.native
}

object ValueObject {
  @scala.inline
  def apply(
    Get: () => js.Any,
    InitInOutParam: (`[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`), js.Any) => Unit,
    InitOutParam: () => Unit,
    Set: (`[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`), js.Any) => Unit
  ): ValueObject = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction0(Get), InitInOutParam = js.Any.fromFunction2(InitInOutParam), InitOutParam = js.Any.fromFunction0(InitOutParam), Set = js.Any.fromFunction2(Set))
    __obj.asInstanceOf[ValueObject]
  }
  @scala.inline
  implicit class ValueObjectOps[Self <: ValueObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitInOutParam(
      value: (`[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`), js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitInOutParam")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInitOutParam(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitOutParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(
      value: (`[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`), js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


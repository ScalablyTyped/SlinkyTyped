package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangeLogEntry extends js.Object {
  /** ChangeLogEntry additions */
  var additions: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
  /** ChangeLogEntry parent */
  var parent: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  /** ChangeLogEntry successors */
  var successors: js.UndefOr[js.Array[ISuccessor] | Null] = js.undefined
}

object IChangeLogEntry {
  @scala.inline
  def apply(
    additions: js.UndefOr[Null | js.Array[js.typedarray.Uint8Array]] = js.undefined,
    parent: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined,
    successors: js.UndefOr[Null | js.Array[ISuccessor]] = js.undefined
  ): IChangeLogEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additions)) __obj.updateDynamic("additions")(additions.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(successors)) __obj.updateDynamic("successors")(successors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeLogEntry]
  }
}


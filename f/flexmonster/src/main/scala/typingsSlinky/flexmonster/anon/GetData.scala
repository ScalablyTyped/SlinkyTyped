package typingsSlinky.flexmonster.anon

import typingsSlinky.flexmonster.mod.GetDataErrorObject
import typingsSlinky.flexmonster.mod.GetDataValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetData extends js.Object {
  
  def getData(options: PrepareDataFunction, callbackHandler: String): Unit = js.native
  def getData(options: PrepareDataFunction, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: PrepareDataFunction,
    callbackHandler: String,
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: PrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: PrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: PrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  
  def getNumberFormat(format: js.Object): js.Object = js.native
}

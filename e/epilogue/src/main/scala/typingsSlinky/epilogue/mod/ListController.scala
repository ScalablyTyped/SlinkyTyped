package typingsSlinky.epilogue.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.sequelize.mod.DataTypeAbstract
import typingsSlinky.sequelize.mod.DataTypeArray
import typingsSlinky.sequelize.mod.DataTypeBigInt
import typingsSlinky.sequelize.mod.DataTypeBlob
import typingsSlinky.sequelize.mod.DataTypeBoolean
import typingsSlinky.sequelize.mod.DataTypeChar
import typingsSlinky.sequelize.mod.DataTypeDate
import typingsSlinky.sequelize.mod.DataTypeDateOnly
import typingsSlinky.sequelize.mod.DataTypeDecimal
import typingsSlinky.sequelize.mod.DataTypeDouble
import typingsSlinky.sequelize.mod.DataTypeEnum
import typingsSlinky.sequelize.mod.DataTypeFloat
import typingsSlinky.sequelize.mod.DataTypeGeometry
import typingsSlinky.sequelize.mod.DataTypeHStore
import typingsSlinky.sequelize.mod.DataTypeInteger
import typingsSlinky.sequelize.mod.DataTypeJSONB
import typingsSlinky.sequelize.mod.DataTypeJSONType
import typingsSlinky.sequelize.mod.DataTypeNow
import typingsSlinky.sequelize.mod.DataTypeNumber
import typingsSlinky.sequelize.mod.DataTypeRange
import typingsSlinky.sequelize.mod.DataTypeReal
import typingsSlinky.sequelize.mod.DataTypeString
import typingsSlinky.sequelize.mod.DataTypeText
import typingsSlinky.sequelize.mod.DataTypeTime
import typingsSlinky.sequelize.mod.DataTypeUUID
import typingsSlinky.sequelize.mod.DataTypeUUIDv1
import typingsSlinky.sequelize.mod.DataTypeUUIDv4
import typingsSlinky.sequelize.mod.DataTypeVirtual
import typingsSlinky.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("epilogue", "ListController")
@js.native
class ListController () extends BaseController {
  
  def _safeishParse(
    value: js.Any,
    `type`: DataTypeAbstract | DataTypeBoolean | DataTypeDateOnly | DataTypeHStore | DataTypeJSONB | DataTypeJSONType | DataTypeNow | DataTypeTime,
    sequelize: Sequelize
  ): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeArray, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeBigInt, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeBlob, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeChar, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeDate, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeDecimal, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeDouble, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeEnum, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeFloat, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeGeometry, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeInteger, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeNumber, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeRange, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeReal, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeString, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeText, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeUUID, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeUUIDv1, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeUUIDv4, sequelize: Sequelize): js.Any = js.native
  def _safeishParse(value: js.Any, `type`: DataTypeVirtual, sequelize: Sequelize): js.Any = js.native
  
  def fetch(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
}

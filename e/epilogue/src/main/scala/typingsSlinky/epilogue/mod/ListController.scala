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
import scala.scalajs.js.annotation._

@JSImport("epilogue", "ListController")
@js.native
class ListController () extends BaseController {
  def _safeishParse(
    value: js.Any,
    `type`: DataTypeAbstract | DataTypeString | DataTypeChar | DataTypeText | DataTypeNumber | DataTypeInteger | DataTypeBigInt | DataTypeFloat | DataTypeTime | DataTypeDate | DataTypeDateOnly | DataTypeBoolean | DataTypeNow | DataTypeBlob | DataTypeDecimal | DataTypeUUID | DataTypeUUIDv1 | DataTypeUUIDv4 | DataTypeHStore | DataTypeJSONType | DataTypeJSONB | DataTypeVirtual | DataTypeArray | DataTypeEnum | DataTypeRange | DataTypeReal | DataTypeDouble | DataTypeGeometry,
    sequelize: Sequelize
  ): js.Any = js.native
  def fetch(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
}


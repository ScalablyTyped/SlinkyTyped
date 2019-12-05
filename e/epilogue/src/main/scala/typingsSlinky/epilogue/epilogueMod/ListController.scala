package typingsSlinky.epilogue.epilogueMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.sequelize.sequelizeMod.DataTypeAbstract
import typingsSlinky.sequelize.sequelizeMod.DataTypeArray
import typingsSlinky.sequelize.sequelizeMod.DataTypeBigInt
import typingsSlinky.sequelize.sequelizeMod.DataTypeBlob
import typingsSlinky.sequelize.sequelizeMod.DataTypeBoolean
import typingsSlinky.sequelize.sequelizeMod.DataTypeChar
import typingsSlinky.sequelize.sequelizeMod.DataTypeDate
import typingsSlinky.sequelize.sequelizeMod.DataTypeDateOnly
import typingsSlinky.sequelize.sequelizeMod.DataTypeDecimal
import typingsSlinky.sequelize.sequelizeMod.DataTypeDouble
import typingsSlinky.sequelize.sequelizeMod.DataTypeEnum
import typingsSlinky.sequelize.sequelizeMod.DataTypeFloat
import typingsSlinky.sequelize.sequelizeMod.DataTypeGeometry
import typingsSlinky.sequelize.sequelizeMod.DataTypeHStore
import typingsSlinky.sequelize.sequelizeMod.DataTypeInteger
import typingsSlinky.sequelize.sequelizeMod.DataTypeJSONB
import typingsSlinky.sequelize.sequelizeMod.DataTypeJSONType
import typingsSlinky.sequelize.sequelizeMod.DataTypeNow
import typingsSlinky.sequelize.sequelizeMod.DataTypeNumber
import typingsSlinky.sequelize.sequelizeMod.DataTypeRange
import typingsSlinky.sequelize.sequelizeMod.DataTypeReal
import typingsSlinky.sequelize.sequelizeMod.DataTypeString
import typingsSlinky.sequelize.sequelizeMod.DataTypeText
import typingsSlinky.sequelize.sequelizeMod.DataTypeTime
import typingsSlinky.sequelize.sequelizeMod.DataTypeUUID
import typingsSlinky.sequelize.sequelizeMod.DataTypeUUIDv1
import typingsSlinky.sequelize.sequelizeMod.DataTypeUUIDv4
import typingsSlinky.sequelize.sequelizeMod.DataTypeVirtual
import typingsSlinky.sequelize.sequelizeMod.Sequelize
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
  def fetch(req: Request[ParamsDictionary], res: Response, context: Context): js.Promise[js.Function0[Unit]] = js.native
}


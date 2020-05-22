package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.apiUserDataReaderMod.UserDataSource
import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@firebase/firestore.@firebase/firestore/dist/src/api/user_data_reader.ContextSettings> */
trait PartialContextSettingsArrayElement extends js.Object {
  var arrayElement: js.UndefOr[Boolean] = js.undefined
  var dataSource: js.UndefOr[UserDataSource] = js.undefined
  var methodName: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[FieldPath] = js.undefined
}

object PartialContextSettingsArrayElement {
  @scala.inline
  def apply(
    arrayElement: js.UndefOr[Boolean] = js.undefined,
    dataSource: UserDataSource = null,
    methodName: String = null,
    path: FieldPath = null
  ): PartialContextSettingsArrayElement = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayElement)) __obj.updateDynamic("arrayElement")(arrayElement.get.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialContextSettingsArrayElement]
  }
}


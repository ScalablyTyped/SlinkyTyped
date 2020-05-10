package typingsSlinky.reactNativeShare.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityItemSource extends js.Object {
  var dataTypeIdentifier: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
  ] = js.native
  var item: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
    */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any] = js.native
  var linkMetadata: js.UndefOr[LinkMetadata] = js.native
  var placeholderItem: ActivityItem = js.native
  var subject: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
  ] = js.native
  var thumbnailImage: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
    */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
  ] = js.native
}

object ActivityItemSource {
  @scala.inline
  def apply(
    item: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
    */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any],
    placeholderItem: ActivityItem
  ): ActivityItemSource = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], placeholderItem = placeholderItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItemSource]
  }
  @scala.inline
  implicit class ActivityItemSourceOps[Self <: ActivityItemSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: react-native-share.react-native-share.ActivityItem | null | undefined}
      */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderItem(value: ActivityItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTypeIdentifier(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTypeIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkMetadata(value: LinkMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailImage(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in react-native-share.react-native-share.ActivityType | string ]: string}
      */ typingsSlinky.reactNativeShare.reactNativeShareStrings.ActivityItemSource with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailImage")(js.undefined)
        ret
    }
  }
  
}


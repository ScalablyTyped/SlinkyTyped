package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout item that displays a video. Items can be accessed or created from a Form.
  *
  *     // Open a form by ID and add three new video items, using a long URL,
  *     // a short URL, and a video ID.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('www.youtube.com/watch?v=1234abcdxyz');
  *
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('youtu.be/1234abcdxyz');
  *
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('1234abcdxyz');
  */
@js.native
trait VideoItem extends js.Object {
  def duplicate(): VideoItem = js.native
  def getAlignment(): Alignment = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def getWidth(): Integer = js.native
  def setAlignment(alignment: Alignment): VideoItem = js.native
  def setHelpText(text: String): VideoItem = js.native
  def setTitle(title: String): VideoItem = js.native
  def setVideoUrl(youtubeUrl: String): VideoItem = js.native
  def setWidth(width: Integer): VideoItem = js.native
}

object VideoItem {
  @scala.inline
  def apply(
    duplicate: () => VideoItem,
    getAlignment: () => Alignment,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    getWidth: () => Integer,
    setAlignment: Alignment => VideoItem,
    setHelpText: String => VideoItem,
    setTitle: String => VideoItem,
    setVideoUrl: String => VideoItem,
    setWidth: Integer => VideoItem
  ): VideoItem = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction0(duplicate), getAlignment = js.Any.fromFunction0(getAlignment), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), setAlignment = js.Any.fromFunction1(setAlignment), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle), setVideoUrl = js.Any.fromFunction1(setVideoUrl), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[VideoItem]
  }
  @scala.inline
  implicit class VideoItemOps[Self <: VideoItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuplicate(value: () => VideoItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAlignment(value: () => Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlignment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHelpText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHelpText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => ItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAlignment(value: Alignment => VideoItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlignment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => VideoItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => VideoItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVideoUrl(value: String => VideoItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVideoUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWidth(value: Integer => VideoItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


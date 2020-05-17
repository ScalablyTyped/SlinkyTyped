package typingsSlinky.playerframework.PlayerFramework.Plugins

import typingsSlinky.playerframework.PlayerFramework.MediaPlayer
import typingsSlinky.playerframework.PlayerFramework.PlaylistItem
import typingsSlinky.playerframework.PlayerFramework.PluginBase
import typingsSlinky.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*
		**/
@js.native
trait PlaylistPlugin extends PluginBase {
  /**
  			*
  			**/
  var autoAdvance: Boolean = js.native
  /**
  			*
  			**/
  var currentPlaylistItem: PlaylistItem = js.native
  /**
  			*
  			**/
  var currentPlaylistItemIndex: Double = js.native
  /**
  			*
  			**/
  var playlist: js.Array[PlaylistItem] = js.native
  /**
  			*
  			**/
  var skipBackThreshold: Double = js.native
  /**
  			*
  			**/
  var startupPlaylistItemIndex: Double = js.native
  def canGoToNextPlaylistItem(): Boolean = js.native
  def canGoToPreviousPlaylistItem(): Boolean = js.native
  def goToNextPlaylistItem(): Unit = js.native
  // Methods
  def goToPreviousPlaylistItem(): Unit = js.native
}

object PlaylistPlugin {
  @scala.inline
  def apply(
    autoAdvance: Boolean,
    canGoToNextPlaylistItem: () => Boolean,
    canGoToPreviousPlaylistItem: () => Boolean,
    currentMediaSource: MediaSource,
    currentPlaylistItem: PlaylistItem,
    currentPlaylistItemIndex: Double,
    goToNextPlaylistItem: () => Unit,
    goToPreviousPlaylistItem: () => Unit,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    playlist: js.Array[PlaylistItem],
    skipBackThreshold: Double,
    startupPlaylistItemIndex: Double,
    unload: () => Unit,
    update: MediaSource => Unit
  ): PlaylistPlugin = {
    val __obj = js.Dynamic.literal(autoAdvance = autoAdvance.asInstanceOf[js.Any], canGoToNextPlaylistItem = js.Any.fromFunction0(canGoToNextPlaylistItem), canGoToPreviousPlaylistItem = js.Any.fromFunction0(canGoToPreviousPlaylistItem), currentMediaSource = currentMediaSource.asInstanceOf[js.Any], currentPlaylistItem = currentPlaylistItem.asInstanceOf[js.Any], currentPlaylistItemIndex = currentPlaylistItemIndex.asInstanceOf[js.Any], goToNextPlaylistItem = js.Any.fromFunction0(goToNextPlaylistItem), goToPreviousPlaylistItem = js.Any.fromFunction0(goToPreviousPlaylistItem), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], skipBackThreshold = skipBackThreshold.asInstanceOf[js.Any], startupPlaylistItemIndex = startupPlaylistItemIndex.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlaylistPlugin]
  }
  @scala.inline
  implicit class PlaylistPluginOps[Self <: PlaylistPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAdvance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdvance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanGoToNextPlaylistItem(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canGoToNextPlaylistItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanGoToPreviousPlaylistItem(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canGoToPreviousPlaylistItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentPlaylistItem(value: PlaylistItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPlaylistItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPlaylistItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPlaylistItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToNextPlaylistItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToNextPlaylistItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGoToPreviousPlaylistItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToPreviousPlaylistItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlaylist(value: js.Array[PlaylistItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipBackThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBackThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartupPlaylistItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupPlaylistItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


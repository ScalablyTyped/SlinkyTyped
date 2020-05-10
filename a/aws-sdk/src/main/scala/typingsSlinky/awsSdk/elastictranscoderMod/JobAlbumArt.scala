package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobAlbumArt extends js.Object {
  /**
    * The file to be used as album art. There can be multiple artworks associated with an audio file, to a maximum of 20. Valid formats are .jpg and .png 
    */
  var Artwork: js.UndefOr[Artworks] = js.native
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple album artwork files.    Replace: The specified album art replaces any existing album art.    Prepend: The specified album art is placed in front of any existing album art.    Append: The specified album art is placed after any existing album art.    Fallback: If the original input file contains artwork, Elastic Transcoder uses that artwork for the output. If the original input does not contain artwork, Elastic Transcoder uses the specified album art file.  
    */
  var MergePolicy: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.MergePolicy] = js.native
}

object JobAlbumArt {
  @scala.inline
  def apply(): JobAlbumArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobAlbumArt]
  }
  @scala.inline
  implicit class JobAlbumArtOps[Self <: JobAlbumArt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtwork(value: Artworks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Artwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Artwork")(js.undefined)
        ret
    }
    @scala.inline
    def withMergePolicy(value: MergePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergePolicy")(js.undefined)
        ret
    }
  }
  
}


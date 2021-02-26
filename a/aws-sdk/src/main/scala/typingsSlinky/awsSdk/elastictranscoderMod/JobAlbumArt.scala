package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobAlbumArt extends StObject {
  
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
  implicit class JobAlbumArtMutableBuilder[Self <: JobAlbumArt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtwork(value: Artworks): Self = StObject.set(x, "Artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtworkUndefined: Self = StObject.set(x, "Artwork", js.undefined)
    
    @scala.inline
    def setArtworkVarargs(value: Artwork*): Self = StObject.set(x, "Artwork", js.Array(value :_*))
    
    @scala.inline
    def setMergePolicy(value: MergePolicy): Self = StObject.set(x, "MergePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergePolicyUndefined: Self = StObject.set(x, "MergePolicy", js.undefined)
  }
}

package typingsSlinky.musicmetadata

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MM {
  
  @js.native
  trait Metadata extends StObject {
    
    var album: String = js.native
    
    var albumartist: js.Array[String] = js.native
    
    var artist: js.Array[String] = js.native
    
    var disk: NoOf = js.native
    
    var duration: Double = js.native
    
    var genre: js.Array[String] = js.native
    
    var picture: js.Array[Picture] = js.native
    
    var title: String = js.native
    
    var track: NoOf = js.native
    
    var year: String = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(
      album: String,
      albumartist: js.Array[String],
      artist: js.Array[String],
      disk: NoOf,
      duration: Double,
      genre: js.Array[String],
      picture: js.Array[Picture],
      title: String,
      track: NoOf,
      year: String
    ): Metadata = {
      val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], albumartist = albumartist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], disk = disk.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbumartist(value: js.Array[String]): Self = StObject.set(x, "albumartist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbumartistVarargs(value: String*): Self = StObject.set(x, "albumartist", js.Array(value :_*))
      
      @scala.inline
      def setArtist(value: js.Array[String]): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtistVarargs(value: String*): Self = StObject.set(x, "artist", js.Array(value :_*))
      
      @scala.inline
      def setDisk(value: NoOf): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenre(value: js.Array[String]): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenreVarargs(value: String*): Self = StObject.set(x, "genre", js.Array(value :_*))
      
      @scala.inline
      def setPicture(value: js.Array[Picture]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureVarargs(value: Picture*): Self = StObject.set(x, "picture", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack(value: NoOf): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NoOf extends StObject {
    
    var no: Double = js.native
    
    var of: Double = js.native
  }
  object NoOf {
    
    @scala.inline
    def apply(no: Double, of: Double): NoOf = {
      val __obj = js.Dynamic.literal(no = no.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoOf]
    }
    
    @scala.inline
    implicit class NoOfMutableBuilder[Self <: NoOf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNo(value: Double): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOf(value: Double): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var duration: js.UndefOr[Boolean] = js.native
    
    var fileSize: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Boolean): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    }
  }
  
  @js.native
  trait Picture extends StObject {
    
    var data: Buffer = js.native
    
    var format: String = js.native
  }
  object Picture {
    
    @scala.inline
    def apply(data: Buffer, format: String): Picture = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Picture]
    }
    
    @scala.inline
    implicit class PictureMutableBuilder[Self <: Picture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}

package typingsSlinky.reactNativeCommunityCameraroll

import typingsSlinky.reactNativeCommunityCameraroll.anon.Endcursor
import typingsSlinky.reactNativeCommunityCameraroll.anon.Groupname
import typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.auto
import typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.photo
import typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Delete a photo from the camera roll or media library. photoUris is an array of photo uri's.
    */
  @JSImport("@react-native-community/cameraroll", "deletePhotos")
  @js.native
  def deletePhotos(photoUris: js.Array[String]): js.Promise[Boolean] = js.native
  
  @JSImport("@react-native-community/cameraroll", "getAlbums")
  @js.native
  def getAlbums(params: GetAlbumsParams): js.Promise[js.Array[Album]] = js.native
  
  /**
    * Returns a Promise with photo identifier objects from the local camera
    * roll of the device matching shape defined by `getPhotosReturnChecker`.
    */
  @JSImport("@react-native-community/cameraroll", "getPhotos")
  @js.native
  def getPhotos(params: GetPhotosParams): js.Promise[PhotoIdentifiersPage] = js.native
  
  /**
    * Saves the photo or video to the camera roll or photo library.
    */
  @JSImport("@react-native-community/cameraroll", "save")
  @js.native
  def save(tag: String): js.Promise[String] = js.native
  @JSImport("@react-native-community/cameraroll", "save")
  @js.native
  def save(tag: String, options: SaveToCameraRollOptions): js.Promise[String] = js.native
  
  /**
    * `CameraRoll.saveImageWithTag()` is deprecated. Use `CameraRoll.saveToCameraRoll()` instead.
    */
  @JSImport("@react-native-community/cameraroll", "saveImageWithTag")
  @js.native
  def saveImageWithTag(tag: String): js.Promise[String] = js.native
  
  /**
    * Saves the photo or video to the camera roll or photo library.
    */
  @JSImport("@react-native-community/cameraroll", "saveToCameraRoll")
  @js.native
  def saveToCameraRoll(tag: String): js.Promise[String] = js.native
  @JSImport("@react-native-community/cameraroll", "saveToCameraRoll")
  @js.native
  def saveToCameraRoll_photo(tag: String, `type`: photo): js.Promise[String] = js.native
  @JSImport("@react-native-community/cameraroll", "saveToCameraRoll")
  @js.native
  def saveToCameraRoll_video(tag: String, `type`: video): js.Promise[String] = js.native
  
  @js.native
  trait Album extends StObject {
    
    var count: Double = js.native
    
    var title: String = js.native
  }
  object Album {
    
    @scala.inline
    def apply(count: Double, title: String): Album = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Album]
    }
    
    @scala.inline
    implicit class AlbumMutableBuilder[Self <: Album] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Videos
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Photos
  */
  trait AssetType extends StObject
  object AssetType {
    
    @scala.inline
    def All: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All = "All".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All]
    
    @scala.inline
    def Photos: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Photos = "Photos".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Photos]
    
    @scala.inline
    def Videos: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Videos = "Videos".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Videos]
  }
  
  @js.native
  trait GetAlbumsParams extends StObject {
    
    var assetType: js.UndefOr[AssetType] = js.native
  }
  object GetAlbumsParams {
    
    @scala.inline
    def apply(): GetAlbumsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAlbumsParams]
    }
    
    @scala.inline
    implicit class GetAlbumsParamsMutableBuilder[Self <: GetAlbumsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetType(value: AssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    }
  }
  
  /**
    * Shape of the param arg for the `getPhotosFast` function.
    */
  @js.native
  trait GetPhotosParams extends StObject {
    
    /**
      * A cursor that matches `page_info { end_cursor }` returned from a previous
      * call to `getPhotos`. Note that using this will reduce performance
      * slightly on iOS. An alternative is just using the `fromTime` and `toTime`
      * filters, which have no such impact.
      */
    var after: js.UndefOr[String] = js.native
    
    /**
      * Specifies filter on asset type
      */
    var assetType: js.UndefOr[AssetType] = js.native
    
    /**
      * The number of photos wanted in reverse order of the photo application
      * (i.e. most recent first).
      */
    var first: Double = js.native
    
    /**
      * Filter by creation time with a timestamp in milliseconds. This time is
      * exclusive, so we'll select all photos with `timestamp > fromTime`.
      */
    var fromTime: js.UndefOr[Double] = js.native
    
    /**
      * Specifies filter on group names, like 'Recent Photos' or custom album
      * titles.
      */
    var groupName: js.UndefOr[String] = js.native
    
    /**
      * Specifies which group types to filter the results to.
      */
    var groupTypes: js.UndefOr[GroupType] = js.native
    
    /**
      * Specific fields in the output that we want to include, even though they
      * might have some performance impact.
      */
    var include: js.UndefOr[js.Array[Include]] = js.native
    
    /**
      * Filter by mimetype (e.g. image/jpeg). Note that using this will reduce
      * performance slightly on iOS.
      */
    var mimeTypes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Filter by creation time with a timestamp in milliseconds. This time is
      * inclusive, so we'll select all photos with `timestamp <= toTime`.
      */
    var toTime: js.UndefOr[Double] = js.native
  }
  object GetPhotosParams {
    
    @scala.inline
    def apply(first: Double): GetPhotosParams = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPhotosParams]
    }
    
    @scala.inline
    implicit class GetPhotosParamsMutableBuilder[Self <: GetPhotosParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAssetType(value: AssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
      
      @scala.inline
      def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromTime(value: Double): Self = StObject.set(x, "fromTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromTimeUndefined: Self = StObject.set(x, "fromTime", js.undefined)
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      @scala.inline
      def setGroupTypes(value: GroupType): Self = StObject.set(x, "groupTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupTypesUndefined: Self = StObject.set(x, "groupTypes", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Array[Include]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: Include*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      @scala.inline
      def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
      
      @scala.inline
      def setToTime(value: Double): Self = StObject.set(x, "toTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToTimeUndefined: Self = StObject.set(x, "toTime", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Album
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Event
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Faces
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Library
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.PhotoStream
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.SavedPhotos
  */
  trait GroupType extends StObject
  object GroupType {
    
    @scala.inline
    def Album: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Album = "Album".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Album]
    
    @scala.inline
    def All: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All = "All".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.All]
    
    @scala.inline
    def Event: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Event = "Event".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Event]
    
    @scala.inline
    def Faces: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Faces = "Faces".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Faces]
    
    @scala.inline
    def Library: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Library = "Library".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.Library]
    
    @scala.inline
    def PhotoStream: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.PhotoStream = "PhotoStream".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.PhotoStream]
    
    @scala.inline
    def SavedPhotos: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.SavedPhotos = "SavedPhotos".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.SavedPhotos]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.filename
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.fileSize
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.location
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.imageSize
    - typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.playableDuration
  */
  trait Include extends StObject
  object Include {
    
    @scala.inline
    def fileSize: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.fileSize = "fileSize".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.fileSize]
    
    @scala.inline
    def filename: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.filename = "filename".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.filename]
    
    @scala.inline
    def imageSize: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.imageSize = "imageSize".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.imageSize]
    
    @scala.inline
    def location: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.location = "location".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.location]
    
    @scala.inline
    def playableDuration: typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.playableDuration = "playableDuration".asInstanceOf[typingsSlinky.reactNativeCommunityCameraroll.reactNativeCommunityCamerarollStrings.playableDuration]
  }
  
  @js.native
  trait PhotoIdentifier extends StObject {
    
    var node: Groupname = js.native
  }
  object PhotoIdentifier {
    
    @scala.inline
    def apply(node: Groupname): PhotoIdentifier = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoIdentifier]
    }
    
    @scala.inline
    implicit class PhotoIdentifierMutableBuilder[Self <: PhotoIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: Groupname): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PhotoIdentifiersPage extends StObject {
    
    var edges: js.Array[PhotoIdentifier] = js.native
    
    var page_info: Endcursor = js.native
  }
  object PhotoIdentifiersPage {
    
    @scala.inline
    def apply(edges: js.Array[PhotoIdentifier], page_info: Endcursor): PhotoIdentifiersPage = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoIdentifiersPage]
    }
    
    @scala.inline
    implicit class PhotoIdentifiersPageMutableBuilder[Self <: PhotoIdentifiersPage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdges(value: js.Array[PhotoIdentifier]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesVarargs(value: PhotoIdentifier*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setPage_info(value: Endcursor): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SaveToCameraRollOptions extends StObject {
    
    var album: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[photo | video | auto] = js.native
  }
  object SaveToCameraRollOptions {
    
    @scala.inline
    def apply(): SaveToCameraRollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveToCameraRollOptions]
    }
    
    @scala.inline
    implicit class SaveToCameraRollOptionsMutableBuilder[Self <: SaveToCameraRollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
      
      @scala.inline
      def setType(value: photo | video | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

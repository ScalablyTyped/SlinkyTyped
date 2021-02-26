package typingsSlinky.googlePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object google {
    
    object picker {
      
      object Action {
        
        @JSGlobal("google.picker.Action")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("google.picker.Action.CANCEL")
        @js.native
        def CANCEL: String = js.native
        @scala.inline
        def CANCEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Action.PICKED")
        @js.native
        def PICKED: String = js.native
        @scala.inline
        def PICKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PICKED")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("google.picker.DocsUploadView")
      @js.native
      class DocsUploadView ()
        extends typingsSlinky.googlePicker.google.picker.DocsUploadView
      
      @JSGlobal("google.picker.DocsView")
      @js.native
      // Constructor. The ViewId must be one of the Google Drive views. Default is ViewId.DOCS.
      class DocsView ()
        extends typingsSlinky.googlePicker.google.picker.DocsView {
        def this(viewId: String) = this()
      }
      
      object DocsViewMode {
        
        @JSGlobal("google.picker.DocsViewMode")
        @js.native
        val ^ : js.Any = js.native
        
        // Display documents in a thumbnail grid.
        @JSGlobal("google.picker.DocsViewMode.GRID")
        @js.native
        def GRID: String = js.native
        @scala.inline
        def GRID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRID")(x.asInstanceOf[js.Any])
        
        // Display documents in a detailed list.
        @JSGlobal("google.picker.DocsViewMode.LIST")
        @js.native
        def LIST: String = js.native
        @scala.inline
        def LIST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST")(x.asInstanceOf[js.Any])
      }
      
      object Document {
        
        @JSGlobal("google.picker.Document")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("google.picker.Document.ADDRESS_LINES")
        @js.native
        def ADDRESS_LINES: String = js.native
        @scala.inline
        def ADDRESS_LINES_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDRESS_LINES")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.AUDIENCE")
        @js.native
        def AUDIENCE: String = js.native
        @scala.inline
        def AUDIENCE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIENCE")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.DESCRIPTION")
        @js.native
        def DESCRIPTION: String = js.native
        @scala.inline
        def DESCRIPTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESCRIPTION")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.DURATION")
        @js.native
        def DURATION: String = js.native
        @scala.inline
        def DURATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DURATION")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.EMBEDDABLE_URL")
        @js.native
        def EMBEDDABLE_URL: String = js.native
        @scala.inline
        def EMBEDDABLE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMBEDDABLE_URL")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.ICON_URL")
        @js.native
        def ICON_URL: String = js.native
        @scala.inline
        def ICON_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_URL")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.ID")
        @js.native
        def ID: String = js.native
        @scala.inline
        def ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ID")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.IS_NEW")
        @js.native
        def IS_NEW: String = js.native
        @scala.inline
        def IS_NEW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_NEW")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.LAST_EDITED_UTC")
        @js.native
        def LAST_EDITED_UTC: String = js.native
        @scala.inline
        def LAST_EDITED_UTC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAST_EDITED_UTC")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.LATITUDE")
        @js.native
        def LATITUDE: String = js.native
        @scala.inline
        def LATITUDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LATITUDE")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.LONGITUDE")
        @js.native
        def LONGITUDE: String = js.native
        @scala.inline
        def LONGITUDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONGITUDE")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.MIME_TYPE")
        @js.native
        def MIME_TYPE: String = js.native
        @scala.inline
        def MIME_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIME_TYPE")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.NAME")
        @js.native
        def NAME: String = js.native
        @scala.inline
        def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.NUM_CHILDREN")
        @js.native
        def NUM_CHILDREN: String = js.native
        @scala.inline
        def NUM_CHILDREN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM_CHILDREN")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.PARENT_ID")
        @js.native
        def PARENT_ID: String = js.native
        @scala.inline
        def PARENT_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARENT_ID")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.PHONE_NUMBERS")
        @js.native
        def PHONE_NUMBERS: String = js.native
        @scala.inline
        def PHONE_NUMBERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHONE_NUMBERS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.SERVICE_ID")
        @js.native
        def SERVICE_ID: String = js.native
        @scala.inline
        def SERVICE_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVICE_ID")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.THUMBNAILS")
        @js.native
        def THUMBNAILS: String = js.native
        @scala.inline
        def THUMBNAILS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMBNAILS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.TYPE")
        @js.native
        def TYPE: String = js.native
        @scala.inline
        def TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Document.URL")
        @js.native
        def URL: String = js.native
        @scala.inline
        def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
      }
      
      object Feature {
        
        @JSGlobal("google.picker.Feature")
        @js.native
        val ^ : js.Any = js.native
        
        // Show only documents owned by the user when showing items from Google Drive.
        @JSGlobal("google.picker.Feature.MINE_ONLY")
        @js.native
        def MINE_ONLY: String = js.native
        @scala.inline
        def MINE_ONLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINE_ONLY")(x.asInstanceOf[js.Any])
        
        // Allow user to choose more than one item.
        @JSGlobal("google.picker.Feature.MULTISELECT_ENABLED")
        @js.native
        def MULTISELECT_ENABLED: String = js.native
        @scala.inline
        def MULTISELECT_ENABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MULTISELECT_ENABLED")(x.asInstanceOf[js.Any])
        
        // Hide the navigation pane. If the navigation pane is hidden, users can only select from the first view chosen.
        @JSGlobal("google.picker.Feature.NAV_HIDDEN")
        @js.native
        def NAV_HIDDEN: String = js.native
        @scala.inline
        def NAV_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAV_HIDDEN")(x.asInstanceOf[js.Any])
        
        // For photo uploads, controls whether per-photo selection (as opposed to per-album) selection is enabled.
        @JSGlobal("google.picker.Feature.SIMPLE_UPLOAD_ENABLED")
        @js.native
        def SIMPLE_UPLOAD_ENABLED: String = js.native
        @scala.inline
        def SIMPLE_UPLOAD_ENABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIMPLE_UPLOAD_ENABLED")(x.asInstanceOf[js.Any])
        
        // Whether Team Drive items should be included in results.
        @JSGlobal("google.picker.Feature.SUPPORT_TEAM_DRIVES")
        @js.native
        def SUPPORT_TEAM_DRIVES: String = js.native
        @scala.inline
        def SUPPORT_TEAM_DRIVES_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORT_TEAM_DRIVES")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("google.picker.PickerBuilder")
      @js.native
      class PickerBuilder ()
        extends typingsSlinky.googlePicker.google.picker.PickerBuilder
      
      object Response {
        
        @JSGlobal("google.picker.Response")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("google.picker.Response.ACTION")
        @js.native
        def ACTION: String = js.native
        @scala.inline
        def ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Response.DOCUMENTS")
        @js.native
        def DOCUMENTS: String = js.native
        @scala.inline
        def DOCUMENTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENTS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Response.PARENTS")
        @js.native
        def PARENTS: String = js.native
        @scala.inline
        def PARENTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARENTS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Response.VIEW")
        @js.native
        def VIEW: String = js.native
        @scala.inline
        def VIEW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW")(x.asInstanceOf[js.Any])
      }
      
      object Type {
        
        @JSGlobal("google.picker.Type")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("google.picker.Type.ALBUM")
        @js.native
        def ALBUM: String = js.native
        @scala.inline
        def ALBUM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALBUM")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Type.DOCUMENT")
        @js.native
        def DOCUMENT: String = js.native
        @scala.inline
        def DOCUMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Type.LOCATION")
        @js.native
        def LOCATION: String = js.native
        @scala.inline
        def LOCATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCATION")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Type.PHOTO")
        @js.native
        def PHOTO: String = js.native
        @scala.inline
        def PHOTO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHOTO")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Type.URL")
        @js.native
        def URL: String = js.native
        @scala.inline
        def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.Type.VIDEO")
        @js.native
        def VIDEO: String = js.native
        @scala.inline
        def VIDEO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIDEO")(x.asInstanceOf[js.Any])
      }
      
      object ViewId {
        
        @JSGlobal("google.picker.ViewId")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("google.picker.ViewId.DOCS")
        @js.native
        def DOCS: String = js.native
        @scala.inline
        def DOCS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.DOCS_IMAGES")
        @js.native
        def DOCS_IMAGES: String = js.native
        @scala.inline
        def DOCS_IMAGES_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCS_IMAGES")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.DOCS_IMAGES_AND_VIDEOS")
        @js.native
        def DOCS_IMAGES_AND_VIDEOS: String = js.native
        @scala.inline
        def DOCS_IMAGES_AND_VIDEOS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCS_IMAGES_AND_VIDEOS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.DOCS_VIDEOS")
        @js.native
        def DOCS_VIDEOS: String = js.native
        @scala.inline
        def DOCS_VIDEOS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCS_VIDEOS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.DOCUMENTS")
        @js.native
        def DOCUMENTS: String = js.native
        @scala.inline
        def DOCUMENTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENTS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.DRAWINGS")
        @js.native
        def DRAWINGS: String = js.native
        @scala.inline
        def DRAWINGS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAWINGS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.FOLDERS")
        @js.native
        def FOLDERS: String = js.native
        @scala.inline
        def FOLDERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOLDERS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.FORMS")
        @js.native
        def FORMS: String = js.native
        @scala.inline
        def FORMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.IMAGE_SEARCH")
        @js.native
        def IMAGE_SEARCH: String = js.native
        @scala.inline
        def IMAGE_SEARCH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_SEARCH")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.MAPS")
        @js.native
        def MAPS: String = js.native
        @scala.inline
        def MAPS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAPS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.PDFS")
        @js.native
        def PDFS: String = js.native
        @scala.inline
        def PDFS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.PHOTOS")
        @js.native
        def PHOTOS: String = js.native
        @scala.inline
        def PHOTOS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHOTOS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.PHOTO_ALBUMS")
        @js.native
        def PHOTO_ALBUMS: String = js.native
        @scala.inline
        def PHOTO_ALBUMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHOTO_ALBUMS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.PHOTO_UPLOAD")
        @js.native
        def PHOTO_UPLOAD: String = js.native
        @scala.inline
        def PHOTO_UPLOAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHOTO_UPLOAD")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.PRESENTATIONS")
        @js.native
        def PRESENTATIONS: String = js.native
        @scala.inline
        def PRESENTATIONS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESENTATIONS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.RECENTLY_PICKED")
        @js.native
        def RECENTLY_PICKED: String = js.native
        @scala.inline
        def RECENTLY_PICKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RECENTLY_PICKED")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.SPREADSHEETS")
        @js.native
        def SPREADSHEETS: String = js.native
        @scala.inline
        def SPREADSHEETS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPREADSHEETS")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.VIDEO_SEARCH")
        @js.native
        def VIDEO_SEARCH: String = js.native
        @scala.inline
        def VIDEO_SEARCH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIDEO_SEARCH")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.WEBCAM")
        @js.native
        def WEBCAM: String = js.native
        @scala.inline
        def WEBCAM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEBCAM")(x.asInstanceOf[js.Any])
        
        @JSGlobal("google.picker.ViewId.YOUTUBE")
        @js.native
        def YOUTUBE: String = js.native
        @scala.inline
        def YOUTUBE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YOUTUBE")(x.asInstanceOf[js.Any])
      }
    }
  }
}

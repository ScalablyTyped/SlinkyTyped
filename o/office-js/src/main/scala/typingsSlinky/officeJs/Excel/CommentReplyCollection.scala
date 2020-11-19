package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.CommentReplyCollectionData
import typingsSlinky.officeJs.Excel.Interfaces.CommentReplyCollectionLoadOptions
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.ClientResult
import typingsSlinky.officeJs.OfficeExtension.LoadOption
import typingsSlinky.officeJs.officeJsStrings.Mention
import typingsSlinky.officeJs.officeJsStrings.Plain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of comment reply objects that are part of the comment.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait CommentReplyCollection extends ClientObject {
  
  def add(content: String): CommentReply = js.native
  def add(content: String, contentType: ContentType): CommentReply = js.native
  /**
    * Creates a comment reply for comment.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param content The comment's content. This can be either a string or Interface CommentRichContent (e.g., for comments with mentions). [Api set: ExcelApi 1.10 for string, 1.11 for CommentRichContent object]
    * @param contentType Optional. The type of content contained within the comment. The default value is enum `ContentType.Plain`. [Api set: ExcelApi 1.10 for Enum ContentType.Plain, 1.11 for Enum ContentType.Mention]
    */
  def add(content: CommentRichContent): CommentReply = js.native
  def add(content: CommentRichContent, contentType: ContentType): CommentReply = js.native
  @JSName("add")
  def add_Mention(content: String, contentType: Mention): CommentReply = js.native
  @JSName("add")
  def add_Mention(content: CommentRichContent, contentType: Mention): CommentReply = js.native
  @JSName("add")
  def add_Plain(content: String, contentType: Plain): CommentReply = js.native
  @JSName("add")
  def add_Plain(content: CommentRichContent, contentType: Plain): CommentReply = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentReplyCollection: RequestContext = js.native
  
  /**
    * Gets the number of comment replies in the collection.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Returns a comment reply identified by its ID.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param commentReplyId The identifier for the comment reply.
    */
  def getItem(commentReplyId: String): CommentReply = js.native
  
  /**
    * Gets a comment reply based on its position in the collection.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param index The index value of the comment reply to be retrieved. The collection uses zero-based indexing.
    */
  def getItemAt(index: Double): CommentReply = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CommentReply] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentReplyCollection = js.native
  def load(options: CommentReplyCollectionLoadOptions with CollectionLoadOptions): CommentReplyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): CommentReplyCollection = js.native
  def load(propertyNames: String): CommentReplyCollection = js.native
  def load(propertyNames: js.Array[String]): CommentReplyCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CommentReplyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CommentReplyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CommentReplyCollectionData = js.native
}

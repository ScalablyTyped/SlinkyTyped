package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents the information that describes a revision of something. */
@js.native
trait RevisionTag extends js.Object {
  
  /** contains an identifier for the author that created the revision( can be empty ) */
  var Author: String = js.native
  
  /** contains a comment that the author has left for this revision ( can be empty ) */
  var Comment: String = js.native
  
  /**
    * contains a unique identifier for the revision and must not be empty
    *
    * This identifier can have any form. It can be something like "1.2.3" or "Version 1" etc. It depends on the revision control system how it names the
    * revisions.
    */
  var Identifier: String = js.native
  
  /** contains the time when the revision was created ( can be invalid ) */
  var TimeStamp: DateTime = js.native
}
object RevisionTag {
  
  @scala.inline
  def apply(Author: String, Comment: String, Identifier: String, TimeStamp: DateTime): RevisionTag = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionTag]
  }
  
  @scala.inline
  implicit class RevisionTagOps[Self <: RevisionTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: DateTime): Self = this.set("TimeStamp", value.asInstanceOf[js.Any])
  }
}

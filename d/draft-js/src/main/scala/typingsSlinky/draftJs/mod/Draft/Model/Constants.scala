package typingsSlinky.draftJs.mod.Draft.Model

import typingsSlinky.draftJs.draftJsStrings.bold_
import typingsSlinky.draftJs.draftJsStrings.code_
import typingsSlinky.draftJs.draftJsStrings.italic_
import typingsSlinky.draftJs.draftJsStrings.strikethrough_
import typingsSlinky.draftJs.draftJsStrings.underline_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Constants {
  
  /**
    * Default entity types.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.LINK
    - typingsSlinky.draftJs.draftJsStrings.TOKEN
    - typingsSlinky.draftJs.draftJsStrings.PHOTO
    - typingsSlinky.draftJs.draftJsStrings.IMAGE
  */
  trait ComposedEntityType extends StObject
  object ComposedEntityType {
    
    @scala.inline
    def IMAGE: typingsSlinky.draftJs.draftJsStrings.IMAGE = "IMAGE".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.IMAGE]
    
    @scala.inline
    def LINK: typingsSlinky.draftJs.draftJsStrings.LINK = "LINK".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.LINK]
    
    @scala.inline
    def PHOTO: typingsSlinky.draftJs.draftJsStrings.PHOTO = "PHOTO".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.PHOTO]
    
    @scala.inline
    def TOKEN: typingsSlinky.draftJs.draftJsStrings.TOKEN = "TOKEN".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.TOKEN]
  }
  
  /**
    * The list of default valid block types.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.unstyled
    - typingsSlinky.draftJs.draftJsStrings.paragraph
    - typingsSlinky.draftJs.draftJsStrings.`header-one`
    - typingsSlinky.draftJs.draftJsStrings.`header-two`
    - typingsSlinky.draftJs.draftJsStrings.`header-three`
    - typingsSlinky.draftJs.draftJsStrings.`header-four`
    - typingsSlinky.draftJs.draftJsStrings.`header-five`
    - typingsSlinky.draftJs.draftJsStrings.`header-six`
    - typingsSlinky.draftJs.draftJsStrings.`unordered-list-item`
    - typingsSlinky.draftJs.draftJsStrings.`ordered-list-item`
    - typingsSlinky.draftJs.draftJsStrings.blockquote
    - typingsSlinky.draftJs.draftJsStrings.`code-block`
    - typingsSlinky.draftJs.draftJsStrings.atomic
  */
  trait CoreDraftBlockType extends StObject
  object CoreDraftBlockType {
    
    @scala.inline
    def atomic: typingsSlinky.draftJs.draftJsStrings.atomic = "atomic".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.atomic]
    
    @scala.inline
    def blockquote: typingsSlinky.draftJs.draftJsStrings.blockquote = "blockquote".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.blockquote]
    
    @scala.inline
    def `code-block`: typingsSlinky.draftJs.draftJsStrings.`code-block` = "code-block".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`code-block`]
    
    @scala.inline
    def `header-five`: typingsSlinky.draftJs.draftJsStrings.`header-five` = "header-five".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`header-five`]
    
    @scala.inline
    def `header-four`: typingsSlinky.draftJs.draftJsStrings.`header-four` = "header-four".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`header-four`]
    
    @scala.inline
    def `header-one`: typingsSlinky.draftJs.draftJsStrings.`header-one` = "header-one".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`header-one`]
    
    @scala.inline
    def `header-six`: typingsSlinky.draftJs.draftJsStrings.`header-six` = "header-six".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`header-six`]
    
    @scala.inline
    def `header-three`: typingsSlinky.draftJs.draftJsStrings.`header-three` = "header-three".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`header-three`]
    
    @scala.inline
    def `header-two`: typingsSlinky.draftJs.draftJsStrings.`header-two` = "header-two".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`header-two`]
    
    @scala.inline
    def `ordered-list-item`: typingsSlinky.draftJs.draftJsStrings.`ordered-list-item` = "ordered-list-item".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`ordered-list-item`]
    
    @scala.inline
    def paragraph: typingsSlinky.draftJs.draftJsStrings.paragraph = "paragraph".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.paragraph]
    
    @scala.inline
    def `unordered-list-item`: typingsSlinky.draftJs.draftJsStrings.`unordered-list-item` = "unordered-list-item".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`unordered-list-item`]
    
    @scala.inline
    def unstyled: typingsSlinky.draftJs.draftJsStrings.unstyled = "unstyled".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.unstyled]
  }
  
  type CustomBlockType = String
  
  type DraftBlockType = CoreDraftBlockType | CustomBlockType
  
  /**
    * A type that allows us to avoid passing boolean arguments
    * around to indicate whether a drag type is internal or external.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.internal
    - typingsSlinky.draftJs.draftJsStrings.external
  */
  trait DraftDragType extends StObject
  object DraftDragType {
    
    @scala.inline
    def external: typingsSlinky.draftJs.draftJsStrings.external = "external".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.external]
    
    @scala.inline
    def internal: typingsSlinky.draftJs.draftJsStrings.internal = "internal".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.internal]
  }
  
  /**
    * A set of editor commands that may be invoked by keyboard commands or UI
    * controls. These commands should map to operations that modify content or
    * selection state and update the editor state accordingly.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.undo
    - typingsSlinky.draftJs.draftJsStrings.redo
    - typingsSlinky.draftJs.draftJsStrings.delete
    - typingsSlinky.draftJs.draftJsStrings.`delete-word`
    - typingsSlinky.draftJs.draftJsStrings.backspace
    - typingsSlinky.draftJs.draftJsStrings.`backspace-word`
    - typingsSlinky.draftJs.draftJsStrings.`backspace-to-start-of-line`
    - typingsSlinky.draftJs.draftJsStrings.bold_
    - typingsSlinky.draftJs.draftJsStrings.code_
    - typingsSlinky.draftJs.draftJsStrings.italic_
    - typingsSlinky.draftJs.draftJsStrings.strikethrough_
    - typingsSlinky.draftJs.draftJsStrings.underline_
    - typingsSlinky.draftJs.draftJsStrings.`split-block`
    - typingsSlinky.draftJs.draftJsStrings.`transpose-characters`
    - typingsSlinky.draftJs.draftJsStrings.`move-selection-to-start-of-block`
    - typingsSlinky.draftJs.draftJsStrings.`move-selection-to-end-of-block`
    - typingsSlinky.draftJs.draftJsStrings.`secondary-cut`
    - typingsSlinky.draftJs.draftJsStrings.`secondary-paste`
  */
  trait DraftEditorCommand extends StObject
  object DraftEditorCommand {
    
    @scala.inline
    def backspace: typingsSlinky.draftJs.draftJsStrings.backspace = "backspace".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.backspace]
    
    @scala.inline
    def `backspace-to-start-of-line`: typingsSlinky.draftJs.draftJsStrings.`backspace-to-start-of-line` = "backspace-to-start-of-line".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`backspace-to-start-of-line`]
    
    @scala.inline
    def `backspace-word`: typingsSlinky.draftJs.draftJsStrings.`backspace-word` = "backspace-word".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`backspace-word`]
    
    @scala.inline
    def bold: bold_ = "bold".asInstanceOf[bold_]
    
    @scala.inline
    def code: code_ = "code".asInstanceOf[code_]
    
    @scala.inline
    def delete: typingsSlinky.draftJs.draftJsStrings.delete = "delete".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.delete]
    
    @scala.inline
    def `delete-word`: typingsSlinky.draftJs.draftJsStrings.`delete-word` = "delete-word".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`delete-word`]
    
    @scala.inline
    def italic: italic_ = "italic".asInstanceOf[italic_]
    
    @scala.inline
    def `move-selection-to-end-of-block`: typingsSlinky.draftJs.draftJsStrings.`move-selection-to-end-of-block` = "move-selection-to-end-of-block".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`move-selection-to-end-of-block`]
    
    @scala.inline
    def `move-selection-to-start-of-block`: typingsSlinky.draftJs.draftJsStrings.`move-selection-to-start-of-block` = "move-selection-to-start-of-block".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`move-selection-to-start-of-block`]
    
    @scala.inline
    def redo: typingsSlinky.draftJs.draftJsStrings.redo = "redo".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.redo]
    
    @scala.inline
    def `secondary-cut`: typingsSlinky.draftJs.draftJsStrings.`secondary-cut` = "secondary-cut".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`secondary-cut`]
    
    @scala.inline
    def `secondary-paste`: typingsSlinky.draftJs.draftJsStrings.`secondary-paste` = "secondary-paste".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`secondary-paste`]
    
    @scala.inline
    def `split-block`: typingsSlinky.draftJs.draftJsStrings.`split-block` = "split-block".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`split-block`]
    
    @scala.inline
    def strikethrough: strikethrough_ = "strikethrough".asInstanceOf[strikethrough_]
    
    @scala.inline
    def `transpose-characters`: typingsSlinky.draftJs.draftJsStrings.`transpose-characters` = "transpose-characters".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`transpose-characters`]
    
    @scala.inline
    def underline: underline_ = "underline".asInstanceOf[underline_]
    
    @scala.inline
    def undo: typingsSlinky.draftJs.draftJsStrings.undo = "undo".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.undo]
  }
  
  /**
    * Possible "mutability" options for an entity. This refers to the behavior
    * that should occur when inserting or removing characters in a text range
    * with an entity applied to it.
    *
    * `MUTABLE`:
    *   The text range can be modified freely. Generally used in cases where
    *   the text content and the entity do not necessarily have a direct
    *   relationship. For instance, the text and URI for a link may be completely
    *   different. The user is allowed to edit the text as needed, and the entity
    *   is preserved and applied to any characters added within the range.
    *
    * `IMMUTABLE`:
    *   Not to be confused with immutable data structures used to represent the
    *   state of the editor. Immutable entity ranges cannot be modified in any
    *   way. Adding characters within the range will remove the entity from the
    *   entire range. Deleting characters will delete the entire range. Example:
    *   Facebook Page mentions.
    *
    * `SEGMENTED`:
    *   Segmented entities allow the removal of partial ranges of text, as
    *   separated by a delimiter. Adding characters wihin the range will remove
    *   the entity from the entire range. Deleting characters within a segmented
    *   entity will delete only the segments affected by the deletion. Example:
    *   Facebook User mentions.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.MUTABLE
    - typingsSlinky.draftJs.draftJsStrings.IMMUTABLE
    - typingsSlinky.draftJs.draftJsStrings.SEGMENTED
  */
  trait DraftEntityMutability extends StObject
  object DraftEntityMutability {
    
    @scala.inline
    def IMMUTABLE: typingsSlinky.draftJs.draftJsStrings.IMMUTABLE = "IMMUTABLE".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.IMMUTABLE]
    
    @scala.inline
    def MUTABLE: typingsSlinky.draftJs.draftJsStrings.MUTABLE = "MUTABLE".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.MUTABLE]
    
    @scala.inline
    def SEGMENTED: typingsSlinky.draftJs.draftJsStrings.SEGMENTED = "SEGMENTED".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.SEGMENTED]
  }
  
  /**
    * Possible entity types.
    */
  type DraftEntityType = String | ComposedEntityType
  
  /**
    * A type that allows us to avoid returning boolean values
    * to indicate whether an event was handled or not.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.handled
    - typingsSlinky.draftJs.draftJsStrings.`not-handled`
  */
  trait DraftHandleValue extends StObject
  object DraftHandleValue {
    
    @scala.inline
    def handled: typingsSlinky.draftJs.draftJsStrings.handled = "handled".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.handled]
    
    @scala.inline
    def `not-handled`: typingsSlinky.draftJs.draftJsStrings.`not-handled` = "not-handled".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.`not-handled`]
  }
  
  /**
    * Valid inline styles.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.BOLD
    - typingsSlinky.draftJs.draftJsStrings.CODE
    - typingsSlinky.draftJs.draftJsStrings.ITALIC
    - typingsSlinky.draftJs.draftJsStrings.STRIKETHROUGH
    - typingsSlinky.draftJs.draftJsStrings.UNDERLINE
  */
  trait DraftInlineStyleType extends StObject
  object DraftInlineStyleType {
    
    @scala.inline
    def BOLD: typingsSlinky.draftJs.draftJsStrings.BOLD = "BOLD".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.BOLD]
    
    @scala.inline
    def CODE: typingsSlinky.draftJs.draftJsStrings.CODE = "CODE".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.CODE]
    
    @scala.inline
    def ITALIC: typingsSlinky.draftJs.draftJsStrings.ITALIC = "ITALIC".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.ITALIC]
    
    @scala.inline
    def STRIKETHROUGH: typingsSlinky.draftJs.draftJsStrings.STRIKETHROUGH = "STRIKETHROUGH".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.STRIKETHROUGH]
    
    @scala.inline
    def UNDERLINE: typingsSlinky.draftJs.draftJsStrings.UNDERLINE = "UNDERLINE".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.UNDERLINE]
  }
  
  /**
    * A type that defines if an fragment shall be inserted before or after
    * another fragment or if the selected fragment shall be replaced
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.replace
    - typingsSlinky.draftJs.draftJsStrings.before
    - typingsSlinky.draftJs.draftJsStrings.after
  */
  trait DraftInsertionType extends StObject
  object DraftInsertionType {
    
    @scala.inline
    def after: typingsSlinky.draftJs.draftJsStrings.after = "after".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.after]
    
    @scala.inline
    def before: typingsSlinky.draftJs.draftJsStrings.before = "before".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.before]
    
    @scala.inline
    def replace: typingsSlinky.draftJs.draftJsStrings.replace = "replace".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.replace]
  }
  
  /**
    * A type that allows us to avoid passing boolean arguments
    * around to indicate whether a deletion is forward or backward.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.draftJs.draftJsStrings.backward
    - typingsSlinky.draftJs.draftJsStrings.forward
  */
  trait DraftRemovalDirection extends StObject
  object DraftRemovalDirection {
    
    @scala.inline
    def backward: typingsSlinky.draftJs.draftJsStrings.backward = "backward".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.backward]
    
    @scala.inline
    def forward: typingsSlinky.draftJs.draftJsStrings.forward = "forward".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.forward]
  }
}

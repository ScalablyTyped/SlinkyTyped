package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a {@link TextRange} which is explicitly marked as an index entry for a {@link DocumentIndex} . */
@js.native
trait DocumentIndexMark extends BaseIndexMark {
  
  /** determines if this entry is a main entry. In a document index this entry will be emphasized by assigning a character style to it. */
  var IsMainEntry: Boolean = js.native
  
  /** contains the primary key of the index entry. It is used to build a hierarchical document index. */
  var PrimaryKey: String = js.native
  
  /** contains the secondary key of the index entry. It is used to build a hierarchical document index. */
  var SecondaryKey: String = js.native
}
object DocumentIndexMark {
  
  @scala.inline
  def apply(
    AlternativeText: String,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    IsMainEntry: Boolean,
    PrimaryKey: String,
    SecondaryKey: String,
    TextWrap: WrapTextMode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): DocumentIndexMark = {
    val __obj = js.Dynamic.literal(AlternativeText = AlternativeText.asInstanceOf[js.Any], Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], IsMainEntry = IsMainEntry.asInstanceOf[js.Any], PrimaryKey = PrimaryKey.asInstanceOf[js.Any], SecondaryKey = SecondaryKey.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[DocumentIndexMark]
  }
  
  @scala.inline
  implicit class DocumentIndexMarkMutableBuilder[Self <: DocumentIndexMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMainEntry(value: Boolean): Self = StObject.set(x, "IsMainEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKey(value: String): Self = StObject.set(x, "PrimaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryKey(value: String): Self = StObject.set(x, "SecondaryKey", value.asInstanceOf[js.Any])
  }
}

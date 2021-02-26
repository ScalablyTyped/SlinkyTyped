package typingsSlinky.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents an {@link URI} node that may occur in a RDF graph.
  *
  * Note that this is actually an IRI, but the RDF literature speaks of {@link URIs} only, so we chose to use established terminology.
  *
  * The {@link URI} is split into a Namespace and a LocalName, using the first applicable of the following criteria:  1. after the first occurrence of the
  * fragment separator: "#" 2. after the last occurrence of the path separator: "/" 3. after the last occurrence of the scheme separator: ":" An {@link
  * URI} without a ":" is invalid. This implies that the Namespace part of an {@link URI} must not be empty, while the LocalName part may be empty.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait XURI extends XNode {
  
  var LocalName: String = js.native
  
  var Namespace: String = js.native
}
object XURI {
  
  @scala.inline
  def apply(LocalName: String, Namespace: String, StringValue: String): XURI = {
    val __obj = js.Dynamic.literal(LocalName = LocalName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XURI]
  }
  
  @scala.inline
  implicit class XURIMutableBuilder[Self <: XURI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalName(value: String): Self = StObject.set(x, "LocalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "TermStatsFacet")
@js.native
class TermStatsFacet protected () extends Facet {
  /*
    A facet which computes statistical data based on an aggregate key.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Allows you to return all terms, even if the frequency count is 0. This should not be
    used on fields that contain a large number of unique terms because it could cause
    out-of-memory errors.
    */
  def allTerms(trueFalse: String): TermStatsFacet = js.native
  
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: Boolean): TermStatsFacet = js.native
  
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): TermStatsFacet = js.native
  
  /*
    Computes values across the entire index
    */
  def global(trueFalse: Boolean): TermStatsFacet = js.native
  
  /*
    Sets the field which will be used to pivot on (group-by).
    */
  def keyField(fieldName: String): TermStatsFacet = js.native
  
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: String): TermStatsFacet = js.native
  
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: String): TermStatsFacet = js.native
  
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: String): TermStatsFacet = js.native
  
  /*
    Sets the type of ordering that will be performed on the date
    buckets.  Valid values are:
    count - default, sort by the number of items in the bucket
    term - sort by term value.
    reverse_count - reverse sort of the number of items in the bucket
    reverse_term - reverse sort of the term value.
    total - sorts by the total value of the bucket contents
    reverse_total - reverse sort of the total value of bucket contents
    min - the minimum value in the bucket
    reverse_min - the reverse sort of the minimum value
    max - the maximum value in the bucket
    reverse_max - the reverse sort of the maximum value
    mean - the mean value of the bucket contents
    reverse_mean - the reverse sort of the mean value of bucket contents.
    */
  def order(o: String): TermStatsFacet = js.native
  
  /*
    Allows you to set script parameters to be used during the execution of the script.
    */
  def params(oParams: js.Object): TermStatsFacet = js.native
  
  /*
    Computes values across the the specified scope
    */
  def scope(scope: String): TermStatsFacet = js.native
  
  /*
    Sets a script that will provide the terms for a given document.
    */
  def scriptField(script: String): TermStatsFacet = js.native
  
  /*
    Sets the number of facet entries that will be returned for this facet. For instance, you
    might ask for only the top 5 aggregate keys although there might be hundreds of
    unique keys. Higher settings could cause memory strain.
    */
  def size(facetSize: Double): TermStatsFacet = js.native
  
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Sets the field for which statistical information will be generated.
    */
  def valueField(fieldName: String): TermStatsFacet = js.native
  
  /*
    Define a script to evaluate of which the result will be used to generate
    the statistical information.
    */
  def valueScript(code: String): TermStatsFacet = js.native
}

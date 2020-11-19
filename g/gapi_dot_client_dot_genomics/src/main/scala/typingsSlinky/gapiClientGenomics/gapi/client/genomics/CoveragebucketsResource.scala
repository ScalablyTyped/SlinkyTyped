package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGenomics.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoveragebucketsResource extends js.Object {
  
  /**
    * Lists fixed width coverage buckets for a read group set, each of which
    * correspond to a range of a reference sequence. Each bucket summarizes
    * coverage information across its corresponding genomic range.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Coverage is defined as the number of reads which are aligned to a given
    * base in the reference sequence. Coverage buckets are available at several
    * precomputed bucket widths, enabling retrieval of various coverage 'zoom
    * levels'. The caller must have READ permissions for the target read group
    * set.
    */
  def list(request: End): Request[ListCoverageBucketsResponse] = js.native
}
object CoveragebucketsResource {
  
  @scala.inline
  def apply(list: End => Request[ListCoverageBucketsResponse]): CoveragebucketsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CoveragebucketsResource]
  }
  
  @scala.inline
  implicit class CoveragebucketsResourceOps[Self <: CoveragebucketsResource] (val x: Self) extends AnyVal {
    
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
    def setList(value: End => Request[ListCoverageBucketsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}

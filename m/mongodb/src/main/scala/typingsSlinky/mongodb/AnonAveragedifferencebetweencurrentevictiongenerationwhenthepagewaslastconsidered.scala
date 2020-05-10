package typingsSlinky.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered extends js.Object {
  var `Average difference between current eviction generation when the page was last considered`: Double = js.native
  var `Average on-disk page image size seen`: Double = js.native
  var `Clean pages currently in cache`: Double = js.native
  var `Current eviction generation`: Double = js.native
  var `Dirty pages currently in cache`: Double = js.native
  var `Entries in the root page`: Double = js.native
  var `Internal pages currently in cache`: Double = js.native
  var `Leaf pages currently in cache`: Double = js.native
  var `Maximum difference between current eviction generation when the page was last considered`: Double = js.native
  var `Maximum page size seen`: Double = js.native
  var `Minimum on-disk page image size seen`: Double = js.native
  var `On-disk page image sizes smaller than a single allocation unit`: Double = js.native
  var `Pages created in memory and never written`: Double = js.native
  var `Pages currently queued for eviction`: Double = js.native
  var `Pages that could not be queued for eviction`: Double = js.native
  var `Refs skipped during cache traversal`: Double = js.native
  var `Size of the root page`: Double = js.native
  var `Total number of pages currently in cache`: Double = js.native
}

object AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered {
  @scala.inline
  def apply(
    `Average difference between current eviction generation when the page was last considered`: Double,
    `Average on-disk page image size seen`: Double,
    `Clean pages currently in cache`: Double,
    `Current eviction generation`: Double,
    `Dirty pages currently in cache`: Double,
    `Entries in the root page`: Double,
    `Internal pages currently in cache`: Double,
    `Leaf pages currently in cache`: Double,
    `Maximum difference between current eviction generation when the page was last considered`: Double,
    `Maximum page size seen`: Double,
    `Minimum on-disk page image size seen`: Double,
    `On-disk page image sizes smaller than a single allocation unit`: Double,
    `Pages created in memory and never written`: Double,
    `Pages currently queued for eviction`: Double,
    `Pages that could not be queued for eviction`: Double,
    `Refs skipped during cache traversal`: Double,
    `Size of the root page`: Double,
    `Total number of pages currently in cache`: Double
  ): AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Average difference between current eviction generation when the page was last considered")((`Average difference between current eviction generation when the page was last considered`).asInstanceOf[js.Any])
    __obj.updateDynamic("Average on-disk page image size seen")((`Average on-disk page image size seen`).asInstanceOf[js.Any])
    __obj.updateDynamic("Clean pages currently in cache")((`Clean pages currently in cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("Current eviction generation")((`Current eviction generation`).asInstanceOf[js.Any])
    __obj.updateDynamic("Dirty pages currently in cache")((`Dirty pages currently in cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("Entries in the root page")((`Entries in the root page`).asInstanceOf[js.Any])
    __obj.updateDynamic("Internal pages currently in cache")((`Internal pages currently in cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("Leaf pages currently in cache")((`Leaf pages currently in cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("Maximum difference between current eviction generation when the page was last considered")((`Maximum difference between current eviction generation when the page was last considered`).asInstanceOf[js.Any])
    __obj.updateDynamic("Maximum page size seen")((`Maximum page size seen`).asInstanceOf[js.Any])
    __obj.updateDynamic("Minimum on-disk page image size seen")((`Minimum on-disk page image size seen`).asInstanceOf[js.Any])
    __obj.updateDynamic("On-disk page image sizes smaller than a single allocation unit")((`On-disk page image sizes smaller than a single allocation unit`).asInstanceOf[js.Any])
    __obj.updateDynamic("Pages created in memory and never written")((`Pages created in memory and never written`).asInstanceOf[js.Any])
    __obj.updateDynamic("Pages currently queued for eviction")((`Pages currently queued for eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("Pages that could not be queued for eviction")((`Pages that could not be queued for eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("Refs skipped during cache traversal")((`Refs skipped during cache traversal`).asInstanceOf[js.Any])
    __obj.updateDynamic("Size of the root page")((`Size of the root page`).asInstanceOf[js.Any])
    __obj.updateDynamic("Total number of pages currently in cache")((`Total number of pages currently in cache`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered]
  }
  @scala.inline
  implicit class AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsideredOps[Self <: AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAverage difference between current eviction generation when the page was last considered`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Average difference between current eviction generation when the page was last considered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAverage on-disk page image size seen`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Average on-disk page image size seen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withClean pages currently in cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clean pages currently in cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCurrent eviction generation`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Current eviction generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDirty pages currently in cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dirty pages currently in cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withEntries in the root page`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries in the root page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInternal pages currently in cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Internal pages currently in cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLeaf pages currently in cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Leaf pages currently in cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMaximum difference between current eviction generation when the page was last considered`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum difference between current eviction generation when the page was last considered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMaximum page size seen`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximum page size seen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMinimum on-disk page image size seen`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimum on-disk page image size seen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOn-disk page image sizes smaller than a single allocation unit`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("On-disk page image sizes smaller than a single allocation unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages created in memory and never written`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages created in memory and never written")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages currently queued for eviction`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages currently queued for eviction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages that could not be queued for eviction`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages that could not be queued for eviction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRefs skipped during cache traversal`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refs skipped during cache traversal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSize of the root page`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size of the root page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTotal number of pages currently in cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total number of pages currently in cache")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


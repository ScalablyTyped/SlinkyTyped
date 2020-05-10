package typingsSlinky.phantomcss.mod._Global_.PhantomCSS

import typingsSlinky.casperjs.mod.Casper
import typingsSlinky.resemblejs.mod.OutputSettings_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhantomCSSOptions extends js.Object {
  /**
    Don't add count number to images. If set to false (default), a filename is
    required when capturing screenshots.
    */
  var addIteratorToImage: Boolean = js.native
  /**
    * Don't add label to generated failure image
    */
  var addLabelToFailedImage: js.UndefOr[Boolean] = js.native
  /**
    A reference to a particular Casper instance. Required for SlimerJS.
    */
  var casper: js.UndefOr[Casper] = js.native
  /**
    Remove results directory tree after run.  Use in conjunction
    with failedComparisonsRoot to see failed comparisons.
    */
  var cleanupComparisonImages: js.UndefOr[Boolean] = js.native
  /**
    You might want to keep master/baseline images in a completely
    different folder to the diffs/failures.  Useful when working
    with version control systems. By default this resolves to the
    screenshotRoot folder.
    */
  var comparisonResultRoot: js.UndefOr[String] = js.native
  /**
    By default, failure images are put in the './failures' folder.
    If failedComparisonsRoot is set to false a separate folder will
    not be created but failure images can still be found alongside
    the original and new images.
    */
  var failedComparisonsRoot: js.UndefOr[String] = js.native
  /**
    * Change the output screenshot filenames for your specific
    * integration
    */
  var fileNameGetter: js.UndefOr[js.Function2[/* rootPath */ String, /* fileName */ js.UndefOr[String], String]] = js.native
  var hideElements: js.UndefOr[String] = js.native
  /**
    libraryRoot is relative to this file and must point to your phantomcss folder (not lib or node_modules). If you are using NPM, this will be './node_modules/phantomcss'.
    */
  var libraryRoot: js.UndefOr[String] = js.native
  /**
    Mismatch tolerance defaults to  0.05%. Increasing this value
    will decrease test coverage
    */
  var mismatchTolerance: js.UndefOr[Double] = js.native
  var onComplete: js.UndefOr[
    js.Function3[
      /* tests */ js.Array[PhantomCSSTest], 
      /* noOfFails */ Double, 
      /* noOfErrors */ Double, 
      Unit
    ]
  ] = js.native
  var onFail: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.native
  /**
    Called when creating new baseline images
    */
  var onNewImage: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.native
  var onPass: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.native
  var onTimeout: js.UndefOr[js.Function1[/* test */ PhantomCSSTest, Unit]] = js.native
  var outputSettings: js.UndefOr[OutputSettings_] = js.native
  /**
    Prefix the screenshot number to the filename, instead of suffixing it
    */
  var prefixCount: js.UndefOr[Boolean] = js.native
  /**
    Rebase is useful when you want to create new baseline
    images without manually deleting the files
    casperjs demo/test.js --rebase
    */
  var rebase: js.UndefOr[js.Any] = js.native
  var screenshotRoot: js.UndefOr[String] = js.native
}

object PhantomCSSOptions {
  @scala.inline
  def apply(addIteratorToImage: Boolean): PhantomCSSOptions = {
    val __obj = js.Dynamic.literal(addIteratorToImage = addIteratorToImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhantomCSSOptions]
  }
  @scala.inline
  implicit class PhantomCSSOptionsOps[Self <: PhantomCSSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddIteratorToImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addIteratorToImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddLabelToFailedImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabelToFailedImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddLabelToFailedImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabelToFailedImage")(js.undefined)
        ret
    }
    @scala.inline
    def withCasper(value: Casper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCasper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casper")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanupComparisonImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupComparisonImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanupComparisonImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupComparisonImages")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisonResultRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonResultRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonResultRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonResultRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedComparisonsRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedComparisonsRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedComparisonsRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedComparisonsRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withFileNameGetter(value: (/* rootPath */ String, /* fileName */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNameGetter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileNameGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNameGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withHideElements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideElements")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraryRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraryRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withMismatchTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mismatchTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMismatchTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mismatchTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(
      value: (/* tests */ js.Array[PhantomCSSTest], /* noOfFails */ Double, /* noOfErrors */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFail(value: /* test */ PhantomCSSTest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFail")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewImage(value: /* test */ PhantomCSSTest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewImage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPass(value: /* test */ PhantomCSSTest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPass")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeout(value: /* test */ PhantomCSSTest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputSettings(value: OutputSettings_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRebase(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebase")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshotRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshotRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotRoot")(js.undefined)
        ret
    }
  }
  
}


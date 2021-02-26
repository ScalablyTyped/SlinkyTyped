package typingsSlinky.jestImageSnapshot

import typingsSlinky.jestImageSnapshot.anon.Counter
import typingsSlinky.jestImageSnapshot.anon.Message
import typingsSlinky.jestImageSnapshot.anon.PartialOptions
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.horizontal
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.percent
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.pixel
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.pixelmatch
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.ssim
import typingsSlinky.jestImageSnapshot.jestImageSnapshotStrings.vertical
import typingsSlinky.pixelmatch.mod.PixelmatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-image-snapshot", "configureToMatchImageSnapshot")
  @js.native
  def configureToMatchImageSnapshot(options: MatchImageSnapshotOptions): js.Function0[Message] = js.native
  
  @JSImport("jest-image-snapshot", "toMatchImageSnapshot")
  @js.native
  def toMatchImageSnapshot(): Message = js.native
  @JSImport("jest-image-snapshot", "toMatchImageSnapshot")
  @js.native
  def toMatchImageSnapshot(options: MatchImageSnapshotOptions): Message = js.native
  
  @JSImport("jest-image-snapshot", "updateSnapshotState")
  @js.native
  def updateSnapshotState[TObject, TPartial](originalSnapshotState: TObject, partialSnapshotState: TPartial): TObject with TPartial = js.native
  
  @js.native
  trait MatchImageSnapshotOptions extends StObject {
    
    /**
      * If set to true, the build will not fail when the screenshots to compare have different sizes.
      * @default false
      */
    var allowSizeMismatch: js.UndefOr[Boolean] = js.native
    
    /**
      * Applies Gaussian Blur on compared images, accepts radius in pixels as value. Useful when you have noise after
      * scaling images per different resolutions on your target website, usually setting its value to 1-2 should be
      * enough to solve that problem.
      * @default 0.
      */
    var blur: js.UndefOr[Double] = js.native
    
    /**
      * The method by which images are compared.
      * `pixelmatch` does a pixel by pixel comparison, whereas `ssim` does a structural similarity comparison.
      * @default 'pixelmatch'
      */
    var comparisonMethod: js.UndefOr[pixelmatch | ssim] = js.native
    
    /**
      * Custom config passed to 'pixelmatch' or 'ssim'
      */
    var customDiffConfig: js.UndefOr[PixelmatchOptions | PartialOptions] = js.native
    
    /**
      * A custom absolute path of a directory to keep this diff in
      */
    var customDiffDir: js.UndefOr[String] = js.native
    
    /**
      * A custom name to give this snapshot. If not provided, one is computed automatically. When a function is provided
      * it is called with an object containing testPath, currentTestName, counter and defaultIdentifier as its first
      * argument. The function must return an identifier to use for the snapshot.
      */
    var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ Counter, String]) | String] = js.native
    
    /**
      * Custom snapshots directory.
      * Absolute path of a directory to keep the snapshot in.
      */
    var customSnapshotsDir: js.UndefOr[String] = js.native
    
    /**
      * Changes diff image layout direction.
      * @default 'horizontal'
      */
    var diffDirection: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Will output base64 string of a diff image to console in case of failed tests (in addition to creating a diff image).
      * This string can be copy-pasted to a browser address string to preview the diff for a failed test.
      * @default false
      */
    var dumpDiffToConsole: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the threshold that would trigger a test failure based on the failureThresholdType selected. This is different
      * to the customDiffConfig.threshold above - the customDiffConfig.threshold is the per pixel failure threshold, whereas
      * this is the failure threshold for the entire comparison.
      * @default 0.
      */
    var failureThreshold: js.UndefOr[Double] = js.native
    
    /**
      * Sets the type of threshold that would trigger a failure.
      * @default 'pixel'.
      */
    var failureThresholdType: js.UndefOr[pixel | percent] = js.native
    
    /**
      * Removes coloring from the console output, useful if storing the results to a file.
      * @default false.
      */
    var noColors: js.UndefOr[Boolean] = js.native
    
    /**
      * Runs the diff in process without spawning a child process.
      * @default false.
      */
    var runInProcess: js.UndefOr[Boolean] = js.native
    
    /**
      * Updates a snapshot even if it passed the threshold against the existing one.
      * @default false.
      */
    var updatePassedSnapshot: js.UndefOr[Boolean] = js.native
  }
  object MatchImageSnapshotOptions {
    
    @scala.inline
    def apply(): MatchImageSnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchImageSnapshotOptions]
    }
    
    @scala.inline
    implicit class MatchImageSnapshotOptionsMutableBuilder[Self <: MatchImageSnapshotOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSizeMismatch(value: Boolean): Self = StObject.set(x, "allowSizeMismatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSizeMismatchUndefined: Self = StObject.set(x, "allowSizeMismatch", js.undefined)
      
      @scala.inline
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setComparisonMethod(value: pixelmatch | ssim): Self = StObject.set(x, "comparisonMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparisonMethodUndefined: Self = StObject.set(x, "comparisonMethod", js.undefined)
      
      @scala.inline
      def setCustomDiffConfig(value: PixelmatchOptions | PartialOptions): Self = StObject.set(x, "customDiffConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDiffConfigUndefined: Self = StObject.set(x, "customDiffConfig", js.undefined)
      
      @scala.inline
      def setCustomDiffDir(value: String): Self = StObject.set(x, "customDiffDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDiffDirUndefined: Self = StObject.set(x, "customDiffDir", js.undefined)
      
      @scala.inline
      def setCustomSnapshotIdentifier(value: (js.Function1[/* parameters */ Counter, String]) | String): Self = StObject.set(x, "customSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSnapshotIdentifierFunction1(value: /* parameters */ Counter => String): Self = StObject.set(x, "customSnapshotIdentifier", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomSnapshotIdentifierUndefined: Self = StObject.set(x, "customSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setCustomSnapshotsDir(value: String): Self = StObject.set(x, "customSnapshotsDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSnapshotsDirUndefined: Self = StObject.set(x, "customSnapshotsDir", js.undefined)
      
      @scala.inline
      def setDiffDirection(value: horizontal | vertical): Self = StObject.set(x, "diffDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffDirectionUndefined: Self = StObject.set(x, "diffDirection", js.undefined)
      
      @scala.inline
      def setDumpDiffToConsole(value: Boolean): Self = StObject.set(x, "dumpDiffToConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpDiffToConsoleUndefined: Self = StObject.set(x, "dumpDiffToConsole", js.undefined)
      
      @scala.inline
      def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureThresholdType(value: pixel | percent): Self = StObject.set(x, "failureThresholdType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureThresholdTypeUndefined: Self = StObject.set(x, "failureThresholdType", js.undefined)
      
      @scala.inline
      def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
      
      @scala.inline
      def setNoColors(value: Boolean): Self = StObject.set(x, "noColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoColorsUndefined: Self = StObject.set(x, "noColors", js.undefined)
      
      @scala.inline
      def setRunInProcess(value: Boolean): Self = StObject.set(x, "runInProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunInProcessUndefined: Self = StObject.set(x, "runInProcess", js.undefined)
      
      @scala.inline
      def setUpdatePassedSnapshot(value: Boolean): Self = StObject.set(x, "updatePassedSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatePassedSnapshotUndefined: Self = StObject.set(x, "updatePassedSnapshot", js.undefined)
    }
  }
  
  object global {
    
    object jest {
      
      @js.native
      trait Matchers[R, T] extends StObject {
        
        def toMatchImageSnapshot(): R = js.native
        def toMatchImageSnapshot(options: MatchImageSnapshotOptions): R = js.native
      }
    }
  }
}

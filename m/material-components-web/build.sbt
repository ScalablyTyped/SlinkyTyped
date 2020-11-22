organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "8.0.0-af9872"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "8.0.0-033543",
  "org.scalablytyped.slinky" %%% "material__banner" % "8.0.0-95a652",
  "org.scalablytyped.slinky" %%% "material__base" % "8.0.0-6c4191",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "8.0.0-54a7fa",
  "org.scalablytyped.slinky" %%% "material__chips" % "8.0.0-58e2ee",
  "org.scalablytyped.slinky" %%% "material__circular-progress" % "8.0.0-a267d3",
  "org.scalablytyped.slinky" %%% "material__data-table" % "8.0.0-53ce1b",
  "org.scalablytyped.slinky" %%% "material__dialog" % "8.0.0-060220",
  "org.scalablytyped.slinky" %%% "material__dom" % "8.0.0-705147",
  "org.scalablytyped.slinky" %%% "material__drawer" % "8.0.0-c6358d",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "8.0.0-fab707",
  "org.scalablytyped.slinky" %%% "material__form-field" % "8.0.0-d58ad8",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "8.0.0-70fc07",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "8.0.0-c6a073",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "8.0.0-bc78a4",
  "org.scalablytyped.slinky" %%% "material__list" % "8.0.0-404077",
  "org.scalablytyped.slinky" %%% "material__menu" % "8.0.0-65a278",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "8.0.0-2fbaae",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "8.0.0-30d25b",
  "org.scalablytyped.slinky" %%% "material__progress-indicator" % "8.0.0-4e916f",
  "org.scalablytyped.slinky" %%% "material__radio" % "8.0.0-1b3ce1",
  "org.scalablytyped.slinky" %%% "material__ripple" % "8.0.0-8be78a",
  "org.scalablytyped.slinky" %%% "material__segmented-button" % "8.0.0-e5ff90",
  "org.scalablytyped.slinky" %%% "material__select" % "8.0.0-f4cac1",
  "org.scalablytyped.slinky" %%% "material__slider" % "8.0.0-289495",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "8.0.0-304c6b",
  "org.scalablytyped.slinky" %%% "material__switch" % "8.0.0-3681a6",
  "org.scalablytyped.slinky" %%% "material__tab" % "8.0.0-0a14b1",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "8.0.0-b95188",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "8.0.0-96ad0b",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "8.0.0-65d842",
  "org.scalablytyped.slinky" %%% "material__textfield" % "8.0.0-864428",
  "org.scalablytyped.slinky" %%% "material__tooltip" % "8.0.0-8403ed",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "8.0.0-dd3027",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

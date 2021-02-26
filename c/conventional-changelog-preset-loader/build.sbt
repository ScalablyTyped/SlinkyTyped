organization := "org.scalablytyped.slinky"
name := "conventional-changelog-preset-loader"
version := "2.3-dt-20200117Z-5c2e27"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "conventional-changelog-core" % "4.1-dt-20201028Z-8761f7",
  "org.scalablytyped.slinky" %%% "conventional-changelog-writer" % "4.0-dt-20200113Z-abd33a",
  "org.scalablytyped.slinky" %%% "conventional-commits-parser" % "3.0-dt-20201026Z-1dafd8",
  "org.scalablytyped.slinky" %%% "conventional-recommended-bump" % "6.0-dt-20201028Z-fa0d88",
  "org.scalablytyped.slinky" %%% "git-raw-commits" % "2.0-dt-20200113Z-066230",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "normalize-package-data" % "2.4-dt-20200515Z-50ee21",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

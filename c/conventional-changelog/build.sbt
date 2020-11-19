organization := "org.scalablytyped.slinky"
name := "conventional-changelog"
version := "3.1-dt-20200117Z-3f8c5d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "conventional-changelog-core" % "4.1-dt-20200117Z-0ca863",
  "org.scalablytyped.slinky" %%% "conventional-changelog-writer" % "4.0-dt-20200113Z-505123",
  "org.scalablytyped.slinky" %%% "conventional-commits-parser" % "3.0-dt-20200113Z-c441e0",
  "org.scalablytyped.slinky" %%% "conventional-recommended-bump" % "6.0-dt-20200113Z-9ab164",
  "org.scalablytyped.slinky" %%% "git-raw-commits" % "2.0-dt-20200113Z-5c2e07",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "normalize-package-data" % "2.4-dt-20200515Z-b6c286",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

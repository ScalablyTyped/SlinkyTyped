organization := "org.scalablytyped.slinky"
name := "conventional-changelog-preset-loader"
version := "2.3-dt-20200117Z-861fcd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "conventional-changelog-core" % "4.1-dt-20201028Z-b51135",
  "org.scalablytyped.slinky" %%% "conventional-changelog-writer" % "4.0-dt-20200113Z-daf932",
  "org.scalablytyped.slinky" %%% "conventional-commits-parser" % "3.0-dt-20201026Z-c33846",
  "org.scalablytyped.slinky" %%% "conventional-recommended-bump" % "6.0-dt-20201028Z-cca751",
  "org.scalablytyped.slinky" %%% "git-raw-commits" % "2.0-dt-20200113Z-bc595c",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "normalize-package-data" % "2.4-dt-20200515Z-c10513",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
